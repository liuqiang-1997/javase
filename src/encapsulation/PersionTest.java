package encapsulation;

public class PersionTest {
    public static void main(String[] args) {
        Persion persion = new Persion(87,"nbv");
//        persion.setAge(130);
//        int age = persion.getAge();
//        System.out.println("年龄是"+age+"岁");
        System.out.println(persion.getAge()+persion.getName());
    }
}
