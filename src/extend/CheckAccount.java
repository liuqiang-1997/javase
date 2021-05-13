package extend;

/**
 * SuperAccount类的子类，表示可透支的账户，有overdraft属性表示可透支限额
 * 重写withdraw方法：
 * 取款金额小于账户余额可直接取款；
 * 取款金额大于账户余额，计算需透支额度，判断可透支额overdraft是否足够支付本次透支额，
 *  可以将账户余额改为0，冲减可透支额度；不可以，提示用户透支失败
 *
 *
 */

public class CheckAccount extends SuperAccount{
    private double overdraft;

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void setId(int id) {
        System.out.println("zllei");
        super.setId(id);
    }

    @Override
    public void withdraw(double amount) {
        if (amount<getBalance()){
            super.withdraw(amount);
        }
        if(amount > getBalance()){
            System.out.println("余额不足");
            double money = amount - getBalance();
            if(overdraft > money){
                overdraft -= money;
                setBalance(0);
                System.out.println("已为您透支【"+money+"】元,目前账户可透支额度为【"+overdraft+"元】");
            }else{
                System.out.println("您的预支额度不足，无法预支此次消费");
            }
        }

    }
}
