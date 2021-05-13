package abstracts;

/**
 * 抽象类，提供抽象方法计算燃油和行驶距离的抽象方法供子类重写实现
 * 子类有Truck与RiverBarge
 *
 */
public abstract class Vehicle {
    /**
     * 计算燃油效率的抽象方法
     * @return 效率值
     */
    public abstract double calcFuelEfficiency();

    /**
     * 计算行驶距离的抽象方法
     * @return 距离
     */
    public abstract double calcTripDistance();

}
