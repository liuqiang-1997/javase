package extend;

public class PersionStudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student.age = 10;
        student.study();
        student.walk();
        int age = student.getAge();
        System.out.println(age);

    }
}
