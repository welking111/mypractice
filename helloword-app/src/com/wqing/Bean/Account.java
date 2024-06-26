package com.wqing.Bean;

public class Account {
    private String carId;
    private String userName;
    private char sex;
    private String passWord;
    private double money;
    private double limit;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getUserName() {
        return userName+(sex =='男'?"先生 ":"女士 ");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return  sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "用户信息{" +
                "银行账户='" + carId + '\'' +
                ", 用户名='" + userName + '\'' +
                ", 性别=" + sex +
                ", 取款限额=" + limit +
                '}';
    }
}
