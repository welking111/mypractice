package com.wqing.Reflcet;

import com.wqing.Bean.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect_Demo {
@Test
    public void testGetConstructors() throws ClassNotFoundException {
        Class c1 = Student.class;
        Class c2 = Class.forName("com.wqing.Bean.Student");
        Student st = new Student();
        Class c3 = st.getClass();

        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "----"
                    + constructor.getParameterCount());
        }

    }
    @Test
    public void testGetConstructor() throws Exception {
    Class c= Student.class;
    Constructor constructor =c.getConstructor();
    Constructor constructor2 =c.getConstructor(String.class);
    }
    @Test
    public  void getaClass() throws Exception {
        Class c= Student.class;
        Constructor constructor=c.getConstructor();
        constructor.setAccessible(true);
        Student student= (Student) constructor.newInstance();
        System.out.println(student.toString());

    }

    @Test
    public void getaparameter() throws Exception {
    Class c=Student.class;
    Field[] fields =c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+" ;"+field.getType());
        }
        Field fname =c.getDeclaredField("name");
        fname.setAccessible(true);
        Student st =new Student();
        //赋值
        fname.set(st,"小明");
        System.out.println(st.getName());

        //取值
        System.out.println(fname.get(st));


    }

    @Test
    public  void  getamethod() throws Exception {
    Class c=Student.class;
    Method[] methods= c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Method method=c.getMethod("setName", String.class); method.setAccessible(true);
        Method method1=c.getMethod("getName");method1.setAccessible(true);

        Student st= new Student();

        method.invoke(st,"大明");
        System.out.println(st.getName());
        System.out.println(method1.invoke(st));
    }
}
