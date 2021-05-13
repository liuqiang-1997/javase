package abstracts;

public class Truck extends Vehicle{

    /**
     * 计算燃油效率
     * @return 燃油效率
     */
    @Override
    public double calcFuelEfficiency() {
        return 10.0;
    }

    /**
     * 计算行驶距离
     * @return 行驶距离
     */
    @Override
    public double calcTripDistance() {
        return 0;
    }
}
