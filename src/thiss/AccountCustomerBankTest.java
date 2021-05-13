package thiss;

/**
 * 创建一个bank类，含有一个customer数组用来存储用户
 * 可获取当前银行有多少用户，以及用户信息
 *
 */
public class AccountCustomerBankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account0 = new Account(1001,100,0.012);
        Account account1 = new Account(1002,20,0.012);
        Account account2 = new Account(1003,20,0.012);
        Account account3 = new Account(1004,20,0.012);
        bank.addCustomer("bryant","kobe");
        bank.addCustomer("james","lebron");
        bank.addCustomer("harden","james");
        bank.addCustomer("pull","crils");
        int numberOfCustomer = bank.getNumberOfCustomer();
        System.out.println("当前银行有:"+numberOfCustomer+"位客户");


        Customer customers = bank.getCustomers(1);
        customers.setAccount(account0);
        customers.getAccount().withdraw(100.0);
        customers.getAccount().deposit(36.98);


        System.out.println(customers.customerInfo(account0));


    }
}
