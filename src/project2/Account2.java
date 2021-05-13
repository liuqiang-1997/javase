package project2;

public class Account2 {
    private int id;  //账号id
    private double balance;  //余额
    private double annuallnterestRate;  //年利率

    public Account2(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void withdraw(double amount){ // 取钱
        if(balance >= amount){
            System.out.println("账户余额充足，已提款："+amount+"元");
            balance -= amount;
            System.out.println("账户余额："+balance+"元");
        }else {
            System.out.println("账户仅有余额："+balance+"元，此次提款失败");
        }
    }

    public void deposit(double amount){ //存钱
        balance += amount;
        System.out.println("已成功存款:"+amount+"元.现账户余额："+balance+"元");
        double money = balance * annuallnterestRate;
        System.out.println("现账户余额年息："+money+"元\n年息总额："+(balance+money)+"元");

    }
}
