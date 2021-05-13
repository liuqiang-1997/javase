package statics;

/**
 * 编写一个实现银行账户的概念，包含属性有账号，密码，存款余额，利率，最小余额
 * 定义封装这些属性的方法，账号要自动生成
 * 编写主类，使用银行账户类输入输出3个储户的上述信息
 * 考虑：那些属性可设计为static属性
 */
public class AccountTest {
    public static void main(String[] args) {
        Account.test = 1;
        Account account = new Account("lq10011",30.00);
        Account.setRate(0.012);
        System.out.println(account.info());
        Account account1 = new Account("000000",30.00);
        Account.setMinMoney(20.00);
        Account account2 = new Account("111111",30.00);

        System.out.println(account1.info());
        System.out.println(account2.info());
    }



}
