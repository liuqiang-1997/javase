package interfaces;

public class CircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.7);
        ComparableCircle c2 = new ComparableCircle(3.6);

        System.out.println(c1.compareTo(c2));
    }



}
