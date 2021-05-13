package project2;


/**
 * 负责菜单显示和处理用户操作
 *
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();




    }

    public CustomerView() {

        Account2 account2 = new Account2(10011,0.5,0.001);
        customerList.addCustomer(new Customer("kobe",'男',41,"13999993333","kobe@126.com"));
        customerList.addCustomer(new Customer("rose",'男',41,"13999993333","kobe@126.com"));
        customerList.addCustomer(new Customer("bron",'男',41,"13999993333","kobe@126.com"));
        customerList.addCustomer(new Customer("jack",'男',41,"13999993333","kobe@126.com"));
        Customer[] allCustomers = customerList.getAllCustomers();
        for (int i = 0; i < allCustomers.length; i++) {
            System.out.println(allCustomers[i].customerInfo(account2));
        }
        allCustomers[2].setAccount(account2);
        Account2 account21 = allCustomers[2].getAccount2();
        account21.deposit(32);

    }

    public void enterMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("请选择执行操作：\n 1-添加用户\n 2-修改用户\n 3-删除用户\n 4-查看用户\n 5-退出");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("是否确认退出？y/n");
                    char c = CMUtility.reaEnter();
                     if (c == 'Y'){
                         flag = false;
                     }

            }
        }
    }
        private void addNewCustomer () {
            System.out.println("==============添加客户==============");
            System.out.println("姓名:");
            String name = CMUtility.readString(4);
            System.out.println("性别:");
            char gender = CMUtility.readChar();
            System.out.println("年龄:");
            int age = CMUtility.readInt();
            System.out.println("电话:");
            String phone = CMUtility.readString(11);
            System.out.println("邮箱:");
            String email = CMUtility.readString(20);

            Customer customer = new Customer(name,gender,age,phone,email);
            boolean success = customerList.addCustomer(customer);
            if (success){
                System.out.println("++++++++++++++++用户添加成功++++++++++++++++");
            }else{
                System.out.println("=========已无名额，添加失败==========");
            }

        }

        private void modifyCustomer () {
            System.out.println("==============修改用户============");
            Customer customers;
            int number;
            for (;;){
                System.out.println("请输入待修改用户的编号(-1退出;1不修改)");
                 number = CMUtility.readInt();
                if (number == -1){
                    return;
                }else{
                    customers = customerList.getCustomers(number - 1);
                    if (customers == null){
                        System.out.println("该位置用户出错");
                    }else{ // 找到该用户
                        break;
                    }
                }
            }
            // 修改客户信息
            System.out.println("姓名:"+customers.getName());
            String name = CMUtility.readString(10, customers.getName());
            System.out.println("性别:"+customers.getGender());
            char gender = CMUtility.readChar(customers.getGender());
            System.out.println("年龄:"+customers.getAge());
            int age = CMUtility.readInt(customers.getAge());
            System.out.println("电话:"+customers.getPhone());
            String phone = CMUtility.readString(11, customers.getPhone());
            System.out.println("邮箱:"+customers.getEmail());
            String email = CMUtility.readString(20, customers.getEmail());

//            customers.setName(name);
//            customers.setGender(gender);
//            customers.setAge(age);
//            customers.setPhone(phone);
//            customers.setEmail(email);

            Customer newCustomer = new Customer(name,gender,age,phone,email);
            boolean success = customerList.replaceCustomer((number - 1), newCustomer);
            if (success){
                System.out.println("++++++++++++++修改成功++++++++++++");
            }


        }

        private void deleteCustomer () {
            System.out.println("==============删除用户============");
            int number;
            for (; ; ) {
                System.out.println("请输入要删除用户的编号(-1退出)");
                number = CMUtility.readInt();
                if (number == -1) {
                    return;
                }
                Customer customers = customerList.getCustomers(number - 1);
                if (customers == null){
                    System.out.println("该位置用户不存在");
                }else{
                    break;
                }
            }
            // 找到用户
            System.out.println("确认是否删除y/n");
            char c = CMUtility.reaEnter();
            if (c =='Y'){
                boolean success = customerList.deleteCustomer(number-1);
                if (success){
                    System.out.println("=========用户删除成功========");
                }
            }
        }
        private void listAllCustomers () {
            System.out.println("+++++++++++用户列表+++++++++++");
            int i = 0;
            if (customerList.getTotal() ==0){
                System.out.println("当前无用户");
            }else{
                System.out.println("编号\t\t\t\t姓名\t\t\t\t\t性别\t\t\t\t\t年龄\t\t\t\t\t电话\t\t\t\t\t邮箱");
                Customer[] allCustomers = customerList.getAllCustomers();
                for (; i < allCustomers.length; i++) {
                    System.out.println((i+1)+"\t\t\t\t"+allCustomers[i].getName()+"\t\t\t\t"+allCustomers[i].getGender()+
                            "\t\t\t\t"+allCustomers[i].getAge()+"\t\t\t\t"+allCustomers[i].getPhone()+"\t\t\t\t"
                            +allCustomers[i].getEmail());
                }

            }


            System.out.println("+++++++++++用户列表结束+++++++++++");

        }

    }
