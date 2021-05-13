package interfaces;

public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double redius) {
        super(redius);
    }

    /**
     * 比较两个圆的半径
     * @param o 对象
     * @return 0，1，-1
     */
    @Override
    public int compareTo(Object o) {
//        double redius = this.getRedius();
//        ComparableCircle circle = (ComparableCircle) o;
//        if(redius==circle.getRedius()) {
//            return 0;
//        }else if(redius<circle.getRedius()) {
//            return -1;
//        }else if(redius>circle.getRedius()) {
//            return 1;
//        }
//        return 0;
        if(this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle com = (ComparableCircle) o;
            if(this.getRedius()==com.getRedius()) {
                return 0;
            }else if(this.getRedius()<com.getRedius()) {
                return -1;
            }else if(this.getRedius()>com.getRedius()) {
                return 1;
            }
        }else{
            throw new RuntimeException("参数类型错误");
        }
        return 0;
    }
}
