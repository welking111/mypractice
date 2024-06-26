package com.wqing.Bean;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();
    //创建对象封装信息
    private Account account;

    public void start() {

        while (true) {
            System.out.println("*******************欢迎进入xx银行系统*******************");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    userLogin(); //此方法把登陆成功的账户放到account
                    if (account != null)
                        controlList();   //
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作~");
            }
        }
    }

    private void controlList() {
        while (true) {
            System.out.println("**************已进入金融业务界面**************");
            System.out.println("当前操作用户：" + account.getUserName());
            System.out.println("1、个人信息查询");
            System.out.println("2、余额查询");
            System.out.println("3、存款");
            System.out.println("4、取款");
            System.out.println("5、转账");
            System.out.println("6、修改密码");
            System.out.println("7、注销账户");
            System.out.println("请选择：6");
            int command = sc.nextInt();
            switch (command) {
                case 1://个人信息查询
                    System.out.println(account.toString());
                    break;
                case 2://余额查询
                    showMoney();
                    break;
                case 3://存款
                    addMoney();
                    break;
                case 4://取款
                    lostMoney();
                    break;
                case 5://转账
                    returnMoney();
                    break;
                case 6://修改密码
                    changePassword();
                    break;
                case 7://注销账户
                    break;
                default:
                    System.out.println("没有该操作~");
            }
        }

    }

    //修改密码
    private void changePassword() {
        while (true) {
            System.out.println("输入当前用户密码:");
            String str = sc.next();
            if (str.equals(account.getPassWord())) {
                //密码输入正确，可以修改密码
                while (true) {
                    System.out.println("输入新密码：");
                    String pw = sc.next();
                    System.out.println("再次输入新密码：");
                    String pw2 = sc.next();
                    //判断两次密码是否一致
                    if (pw.equals(pw2)) {
                        account.setPassWord(pw);
                        break;
                    } else System.out.println("两次密码不一致");
                }
                System.out.println("密码修改成功！");
                break;
            } else System.out.println("输入的原密码有误！");
        }
    }

    //转账
    private void returnMoney() {
        //先判断银行账户数量，小于2个无法转账
        if (accounts.size() > 1) { //大于1个账户可以进行转账
            Account toaccount;

            while (true) {
                System.out.println("输入你要转入的用户账号：");
                String username = sc.next();

                if (getAccountByCardId(username) == null) {
                    System.out.println("系统中没有此账号，请重新输入！");
                    continue;
                } else  //输入正确账号后继续执行
                {
                    toaccount = getAccountByCardId(username);
                    while (true) {
                        System.out.println("输入转账金额：");
                        double newmoney = sc.nextDouble();
                        if (isTrueMoney(newmoney)) {
                            account.setMoney(account.getMoney() - newmoney); //转出账户
                            toaccount.setMoney(toaccount.getMoney() + newmoney); //转入账户
                            System.out.println("转账成功！本次转账" + newmoney + "元");
                            showMoney();
                            break;
                        }

                    }
                    //结束输入账号密码
                }
                break;
            }


        } else System.out.println("账户总数1个，无法进行转账！");
    }

    //取钱
    private void lostMoney() {
        while (true) {
            System.out.println("输入你要取走的金额");
            double newmoney = sc.nextDouble();
            if (isTrueMoney(newmoney)) {
                account.setMoney(account.getMoney() - newmoney);
                System.out.println("取款成功！本次取走" + newmoney + "元");
                showMoney();
                break;
            }
        }


    }

    //存钱
    private void addMoney() {
        while (true) {
            System.out.println("输入你要存入的金额");
            double newmoney = sc.nextDouble();
            if (isTrueMoney(newmoney)) {
                account.setMoney(account.getMoney() + newmoney);
                System.out.println("存款成功！本次存入" + newmoney + "元");
                showMoney();
                break;
            }

        }


    }

    //输入金额有效性判断
    private boolean isTrueMoney(double money) {
        if (money <= 0) {
            System.out.println("输入的钱金额有问题，请检查后重新输入！");
            return false;
        } else return true;
    }


    //查询余额
    private void showMoney() {
        System.out.println("当前账户余额：" + account.getMoney());
    }


    private void userLogin() {

        if (accounts.size() == 0) {
            System.out.println("还没有账户，请去添加账户！");
            return;
        }
        System.out.println("---进入登录界面---");
        while (true) {
            System.out.println("输入用户账号：");
            String username = sc.next();

            if (getAccountByCardId(username) == null) {
                System.out.println("系统中没有此账号，请重新输入！");

            } else  //输入正确账号后继续执行
            {
                while (true) {
                    System.out.println("输入密码：");
                    String passwd = sc.next();
                    //判断密码
                    if (passwd.equals(getAccountByCardId(username).getPassWord())) {
                        account = getAccountByCardId(username);
                        System.out.println("登录成功！欢迎您 " + account.getUserName());
                        break;
                    } else System.out.println("密码输入错误，请重试");
                }
                break; //结束输入账号密码
            }

        }


    }

    //开户方法
    private void createAccount() {
        //创建对象封装信息
        Account account = new Account();
        System.out.println("输入名字：");
        account.setUserName(sc.next());
        while (true) {
            System.out.println("输入性别：");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                account.setSex(sex);
                break;
            } else System.out.println("性别输入有误");
        }

        while (true) {
            System.out.println("输入密码：");
            String pw = sc.next();
            System.out.println("再次输入密码：");
            String pw2 = sc.next();
            //判断两次密码是否一致
            if (pw.equals(pw2)) {
                account.setPassWord(pw);
                break;
            } else System.out.println("两次密码不一致");
        }
        System.out.println("输入取现额度");
        double limit = sc.nextInt();
        account.setLimit(limit);
        //系统生成卡号
        account.setCarId(createId());

        accounts.add(account);
        System.out.println("恭喜你 开户成功！ 用户名：" + account.getUserName());
        System.out.println("开户成功! 用户账号为：" + account.getCarId());
    }

    //系统生成卡号
    private String createId() {
        String cardId = "";
        do {
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            //判断是否重复
        } while (getAccountByCardId(cardId) != null);
        return cardId;
    }

    //根据卡号查询对象返回
    private Account getAccountByCardId(String cardid) {
        for (Account value : accounts) {
            if (value.getCarId().equals(cardid)) {
                return value;
            }
        }
        return null;//查无此账户
    }
}
