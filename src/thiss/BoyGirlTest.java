package thiss;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("james",35);
        Girl girl = new Girl("wade",32);
        Girl girl1 = new Girl("davis",23);
        boy.marry(girl);
        boy.shout();
        girl.marry(boy);
        girl1.marry(boy);
        int compare = girl.compare(girl1);
        System.out.println(girl.getName()+"大"+girl1.getName()+compare+"岁");
    }
}
