package com.wqing.Bean;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    /** 1、展示系统全部电影信息 movies = [m1, m2, m3, ...]*/
    public void  printAllInfo(){
        System.out.println("所有电影信息如下：");
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("------------------------");

        }
    }
    //根据id展示电影详细
    public void priintById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            if(m.getId()==id){
                System.out.println("该电影详情如下：");
                System.out.println("编号：" + m.getId());
                System.out.println("名称：" + m.getName());
                System.out.println("价格：" + m.getPrice());
                System.out.println("得分：" + m.getScore());
                System.out.println("导演：" + m.getDirector());
                System.out.println("主演：" + m.getActor());
                System.out.println("其他信息：" + m.getInfo());
                return; // 已经找到了电影信息，没有必要再执行了
            }
        }
    }
}
