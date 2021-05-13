package thiss;

public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println(this.getName()+"喜欢"+girl.getName());
    }
    public void shout(){
        if (this.age>=22){
            System.out.println("你们可以在一起了");
        }else{
            System.out.println("你太小了，不能在一起");
        }
    }
}
