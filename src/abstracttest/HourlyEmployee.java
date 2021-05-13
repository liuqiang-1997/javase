package abstracttest;

/**
 *  * 4。参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理
 *  *    该类包括：private的成员变量wage和hour
 *  *    实现父类的抽象方法earnings()该方法返回wage*hour的值
 *  *    toString()方法输出员工类型信息及员工的name；number；birthday
 */
public class HourlyEmployee extends Employee{

    private double wage;  //工资
    private double hour;  //时间

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "HourlyEmployee:["+s+"]";
    }
}
