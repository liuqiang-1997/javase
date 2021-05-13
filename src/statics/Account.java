package statics;

/**
 * 编写一个实现银行账户的概念，包含属性有账号，密码，存款余额，利率，最小余额
 * 定义封装这些属性的方法，账号要自动生成
 * 编写主类，使用银行账户类输入输出3个储户的上述信息
 * 考虑：那些属性可设计为static属性
 */
public class Account {
    static int test;
    private static int initnumber = 10011;  // 初始账户
    private int id;
    private String passwd;
    private double balance;
    private static double rate;  // 利率
    private static double minMoney ;  // 最小余额

    public Account(String passwd,double balance) {
        id = initnumber++;
        this.passwd = passwd;
        this.balance = balance;
//        minMoney = 100.00;
//        rate = 0.045;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public  String info(){
        return "ID:["+id+"]\n" +
                "password:["+passwd+"]\n"+
                "balance:["+balance+"]\n"+
                "rate:["+rate+"]\n"+
                "minMoney:["+minMoney+"]";
    }
}
