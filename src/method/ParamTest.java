package method;

public class ParamTest {

    public static void main(String[] args) {
        /**
         * 值传递
         */

        System.out.println("Testing triplevalue");
        double percent = 10;
        System.out.println("before:percent="+ percent);
        tripleValue(percent);
        System.out.println("after:percent="+percent);

        System.out.println("\nTesting tripleSalary");
        Employee harry = new Employee("harry",500);
        System.out.println("before: salary= "+harry.getSalary());
        tripleSalary(harry);
        System.out.println("after: salary= "+harry.getSalary());

        System.out.println("\nTesting swap");
        Employee x = new Employee("alen",12);
        Employee y = new Employee("bool",34);
        Employee a = new Employee("bbbb",12);
        Employee b = new Employee("aaaa",34);
        System.out.println("before: x= "+x.getName());
        System.out.println("before: y= "+y.getName());
        swap(x,y);
        System.out.println("after: x= "+x.getName());
        System.out.println("after: y= "+y.getName());
        System.out.println("*************************");
        System.out.println("before: a= "+a.getName());
        System.out.println("before: b= "+b.getName());
        swaps(a,b);
        System.out.println("after: a= "+a.getName());
        System.out.println("after: b= "+b.getName());


    }
    public static void tripleValue(double x){
        x = 3 * x;
        System.out.println("end of method:x="+x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("end of method: salary="+x.getSalary());
    }
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("end of method: x= "+x.getName());
        System.out.println("end of method: y= "+y.getName());
    }
//    public static void swaps(Employee x,Employee y){
//        Employee employee = new Employee();
//        employee.raiseName(x,y);
//        System.out.println("end of method: a= "+x.getName());
//        System.out.println("end of method: b= "+y.getName());
//    }
    public static void swaps(Employee x,Employee y){
        x.raiseName(y);
        System.out.println("end of method: a= "+x.getName());
        System.out.println("end of method: b= "+y.getName());
    }
}
    class Employee{
        private String name;
        private double salary;

        public Employee(String n,double s){
            name = n;
            salary = s;
        }
        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary(){
            return salary;
        }

        public void raiseSalary(double byPercent){
            double raise = salary * byPercent /100;
            salary+=raise;
        }
    //    public void raiseName(Employee a,Employee b){
    //        String temp1,temp2;
    //        temp1 = a.getName();
    //        temp2 = b.getName();
    //        a.setName(temp2);
    //        b.setName(temp1);
    //    }
        public void raiseName(Employee employee){
            String temp = employee.getName();
            employee.setName(this.name);
            this.name = temp;
        }
    }