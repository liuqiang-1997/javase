package project1;


public class FamilyAccount {
    public static void main(String[] args) {
        boolean flag = true;
        int inItMoney = 1000;
        String details = "收支\t\t账户金额\t\t收支金额\t\t说     明\n";
        while(flag){
            System.out.println("请选择执行操作：\n 1-查看收支明细\n 2-登记收入\n 3-登记支出\n 4-推出");
            int w = Utility.readMenuSelection();
            System.out.println(w);
            switch (w){
                case 1:
                    System.out.println("====当前收支明细记录====");
                    System.out.println(details);
                    System.out.println("_+++++++++++++++++++++++++++_");
                    break;
                case 2:
                    System.out.println("本次收入金额：");
                    int money = Utility.readenternumber();
                    System.out.println("本次收入说明：");
                    String str = Utility.readString();
                    inItMoney += money;
                    details += "收入\t\t"+inItMoney+"\t\t"+money+"\t\t\t"+str+"\n";

                    System.out.println("--------登记结束--------\n");

                    break;
                case 3:
                    System.out.println("本次支出金额：");
                    int money1 = Utility.readenternumber();
                    System.out.println("本次支出说明：");
                    String str1 = Utility.readString();
                    inItMoney -= money1;
                    details += "支出\t\t"+inItMoney+"\t\t"+money1+"\t\t\t"+str1+"\n";

                    System.out.println("--------登记结束--------\n");

                    break;
                case 4:
                    System.out.println("4-推出");
                    System.out.println("是否确认退出（y/n）");
                    String c =  Utility.readConfirmSelection();
                    if(c.equals("y")){
                        flag = false;
                }
                    break;
            }
        }
    }
}
