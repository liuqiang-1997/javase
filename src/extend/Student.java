package extend;

public class Student extends Persion{


    public void study() {
        super.walk();
        System.out.println("student的study方法");
    }

    @Override
    public void walk() {
        System.out.println("student重写的Persion的walk方法");
    }

    public int getAge(){
        return age;
    }
}
