package abstracts;

/**
 * 即是员工，还具有奖金（bonus）属性
 */
public  class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager的工作是管理");
        System.out.println("他的奖金为"+bonus);
    }
}
