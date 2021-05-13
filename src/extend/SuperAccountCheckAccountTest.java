package extend;

/**
 * SuperAccount与CheckAccount测试类
 * 创建一个账号为10011，余额为20000，年利率4.5%的SuperAccount对象
 * 使用取款方法取30000元并打印余额；在取款2500，使用存款方法存3000元，打印余额与月利率
 *
 * 创建一个账号为10011，余额20000，年利率4.5% 可透支5000的checkAccount对象
 * 使用提款方法依次取款5000，18000，3000，并打印账户余额和可透支额
 */
public class SuperAccountCheckAccountTest {
    public static void main(String[] args) {
        SuperAccount superAccount = new SuperAccount(10011,20000,0.045);
        superAccount.withdraw(30000);
        superAccount.withdraw(2500);
        superAccount.deposit(3000);

        System.out.println("+++++++++++++++++++++++++++\n");

        CheckAccount checkAccount = new CheckAccount(10011,20000,0.045,5000);
        System.out.println("当前余额"+checkAccount.getBalance()+"透支额度"+checkAccount.getOverdraft());
        checkAccount.withdraw(5000);
        System.out.println("当前余额"+checkAccount.getBalance()+"透支额度"+checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("当前余额"+checkAccount.getBalance()+"透支额度"+checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("当前余额"+checkAccount.getBalance()+"透支额度"+checkAccount.getOverdraft());

        //  多态测试
        SuperAccount s = new CheckAccount(10011,20000,0.045,5000);
        System.out.println(s.getId());
        s.setId(10022);
        s.withdraw(21000);
        System.out.println(s.getId());

        // 向下转型
        CheckAccount c = (CheckAccount) s;
        double overdraft = c.getOverdraft();
        double overdraft1 = ((CheckAccount) s).getOverdraft();
        System.out.println(overdraft);
        System.out.println(overdraft1);

        // 向下转型的前提是有多态性
//        CheckAccount cs = (CheckAccount) superAccount;
//        double balance = cs.getBalance();
//        System.out.println(balance);


        boolean b = s instanceof SuperAccountInstanceofTest;
        System.out.println(b);

    }
}
