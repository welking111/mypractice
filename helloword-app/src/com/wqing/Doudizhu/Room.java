package com.wqing.Doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    //必须有一副牌
    private List<Card> allCards= new ArrayList<>();
    public Room(){
        //做出54张牌 用花色和点数进行双for
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors={"♠","♣","♦","♥"};
        int size=3;
        for(String number:numbers){

            for(String color:colors){
                //循环得到牌
                Card c=new Card(number,color,size );
                allCards.add(c);
            }
            size++;
        }
        //单独封装大小王
        allCards.add(new Card("小王","🃏",size++));
        allCards.add(new Card("大王","🃏",size));
        //System.out.println("新牌:"+allCards);
    }

    //游戏启动
    public void start(){
        //洗牌
        Collections.shuffle(allCards);
        //System.out.println("新牌:"+allCards);

        //发牌 定义三个玩家
        List<Card> player1 =new ArrayList<>();
        List<Card> player2 =new ArrayList<>();
        List<Card> player3 =new ArrayList<>();
        List<Card> lastThreeCards =allCards.subList(allCards.size()-3,allCards.size());
        //依次发出51张牌，剩下三张作底牌
        for (int i = 0; i <allCards.size()-3 ; i++) {
        Card c=allCards.get(i);
        //判断发给谁
            if(i%3==0){
                player1.add(c);
            }else if(i%3==1){
                player2.add(c);
            }else  player3.add(c);
        }
        //看牌
//        System.out.println("player1:"+player1);
//        System.out.println("player2:"+player2);
//        System.out.println("player3:"+player3);
//        System.out.println("lastThreeCards:"+lastThreeCards);

        //排序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("player3:"+player3);
    }
    private void  sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize()-o2.getSize(); //升序排序
               // return o2.getSize()-o1.getSize(); //降序排序
            }
        });
    }
}
