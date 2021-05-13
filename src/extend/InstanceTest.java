package extend;

/**
 * 多态性练习
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest instanceTest = new InstanceTest();
//        instanceTest.method(new Person());
        instanceTest.method(new Gradate());
        instanceTest.method(new Students());


    }
    public void method(Person e){
        // 虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);
        // instanceof判断
        if(e instanceof Gradate){
            System.out.println("a Gradate Student");
            System.out.println("a Student");
            System.out.println("a Person\n");
        }else if(e instanceof Students){
            System.out.println("a Student");
            System.out.println("a Person\n");
        }else if (e instanceof Person){

            System.out.println("a Person\n");
        }

    }
}

    class Person{
        protected int age = 50;
        protected String name = "Person";

        public Person() {
        }

        public String getInfo() {
            return "Name: ["+name+"] Age: ["+age+"]";
        }
    }

    class Students extends Person{
        protected String school = "pku";

        @Override
        public String getInfo() {
            return "Name: ["+name+"] Age: ["+age+"]"+"\nschool: ["+school+"]";
        }
    }

    class Gradate extends Students{
        public String major = "IT";

        @Override
        public String getInfo() {
            return "Name: ["+name+"] Age: ["+age+"]"+"\nSchool: " +
                    "["+school+"]"+"\nMajor: ["+major+"]";

        }
    }





