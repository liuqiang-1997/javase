package extend;

public class Persion {
    private String name;
    int age;

    public Persion() {
    }

    public void eat(){
        System.out.println("Persion 的公开eat方法");
    }

    private void show(){
        System.out.println("Persion的私有show方法");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void walk(){
        System.out.println("Persion的walk方法");
    }
}
