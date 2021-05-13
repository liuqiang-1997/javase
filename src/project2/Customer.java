package project2;

import thiss.Account;

/**
 * 封装客户信息
 */
public class Customer {
    private String name;  // 客户姓名
    private char gender;  // 性别
    private int age;  //客户年龄
    private String phone;  //电话
    private String email;  // 电子邮箱
    private Account2 account2; // 客户账户

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account2 getAccount2() {
        return account2;
    }

    public void setAccount(Account2 account2) {
        this.account2 = account2;
    }
    public String customerInfo(Account2 account2){
        String info = "\nCustomer：["+this.getName()+"] 的账户信息如下: \n"+
                "账号: "+account2.getId()+"\n余额: "+account2.getBalance()+"元\n"+
                "年利率: "+(account2.getAnnuallnterestRate()*100)+"%";
        return info;
    }


}
