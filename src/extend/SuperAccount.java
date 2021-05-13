package extend;

/**
 * 本类为一个模拟账户，有以下属性，方法：
 * id账号；balance余额；annuallnterestRate年利率
 * 访问器方法，月利率返回方法，存取款方法
 *
 * 写一个测试类，创建一个账号为10011，余额为20000，年利率4.5%的SuperAccount对象
 * 使用取款方法取30000元并打印余额；在取款2500，使用存款方法存3000元，打印余额与月利率
 */

public class SuperAccount {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public SuperAccount() {
    }

    public SuperAccount(int id, double balance, double annuallnterestRate) {
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

    /**
     * 取款方法
     * @param amount 取款金额
     */
    public void withdraw(double amount){
        if (balance-amount>=0){
            balance -= amount;
            System.out.println("取款：【"+amount+"元】成功。账户余额：【"+balance+"元】");
        }else{
            System.out.println("账户余额【"+balance+"元】，取款失败！");
        }

    }

    /**
     * 存款方法
     * @param amount 存款金额
     */
    public void deposit(double amount){
        if(amount<0){
            System.out.println("存款不能为负数");
        }else{
            balance += amount;
            System.out.println("已成功存款【"+amount+"元】，当前账户余额【"+balance+"元】\n" +
                    "月利率【"+((annuallnterestRate/12)*100)+"%】，月利收入为"+getMonthlyInterest()+"元");
        }
    }

    /**
     * 返回月利率的方法
     * @return double型月利率
     */
    public double getMonthlyInterest(){
        double monthlyInterset = (annuallnterestRate*balance) / 12;
        return monthlyInterset;
    }
}
