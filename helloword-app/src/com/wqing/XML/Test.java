package com.wqing.XML;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {


        SAXReader saxReader = new SAXReader();

        //文件流变成document对象
        Document document=saxReader.read("helloword-app/afile.xml");

        //从document对象获取根element
        Element root =document.getRootElement();

        System.out.println(root.elementText("people"));
        System.out.println(root.attributeValue("desc"));

        //获取根对象下的元素
        List<Element> elements =root.elements();

        for (Element element : elements) {
            System.out.println(element.getName());
            List<Attribute> attributes=element.attributes();
            for (Attribute attribute : attributes) {
                System.out.println(attribute.getName()+":"+attribute.getValue());
            }
            List<Element> elements1=element.elements();
            for (Element element1 : elements1) {
                System.out.print(element1.getName()+" ");
            }
            System.out.println("文本内容"+":"+element.getTextTrim());
            System.out.println("名字是:"+element.elementText("name"));
            System.out.println("名字是:"+element.element("name").getText());
        }

    }
}
