package encapsulation;

public class Persion {
    private int age;
    private String name;

    public Persion(){
        age = 18;
    }
    public Persion(int ag,String nam) {
//        this.age = age;
//        this.name = name;
        age = ag;
        name = nam;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age>=0 &&age<=130) {
            this.age = age;
        }else{
            throw new RuntimeException("年龄不合法");
//            System.out.println("年龄不合法");
        }
    }
}
