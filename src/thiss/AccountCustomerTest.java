package thiss;

/**
 * Account类与Customer类的测试
 * 创建一个Customer名字为【jone Smith】其下有一个
 * 账号为1000，余额2000，年利率1.23%的账户
 * 对jone Smith操作：
 * 存100，取960，再取2000
 * 打印jone Smith的基本信息
 */
public class AccountCustomerTest {
    public static void main(String[] args) {
        Account account = new Account(1000,2000,0.0123);
        Customer customer = new Customer("jane"," Smith");
        customer.setAccount(account);

        Account account1 = customer.getAccount();
        account1.deposit(100.0);
        account1.withdraw(960.0);
        account.withdraw(2000);

        System.out.println(customer.customerInfo(account1));

//        System.out.println("\nCustomer：["+customer.getFirstName()+customer.getLastNAme()+"] 的账户信息如下: \n"+
//                "账号: "+account1.getId()+"\n余额: "+account1.getBalance()+"元\n"+
//                "年利率: "+(account1.getAnnuallnterestRate()*100)+"%");

    }

}
