package objects;

/**
 * 覆盖equlas方法，使其判断两个MyData类型对象的年月日都相同时，结果为true
 */
public class MyData {

    private int day;
    private int month;
    private int year;
    public static void main(String[] args) {
        MyData myData = new MyData(12,3,1997);
        MyData myData1 = new MyData(12,3,1997);
        if (myData == myData1){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        if (myData.equals(myData1)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        System.out.println(myData.toString());
    }

    public MyData(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof MyData){
            MyData myData = (MyData)obj;
            return this.day ==myData.day && this.month == myData.month
                    && this.year == myData.year ;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
