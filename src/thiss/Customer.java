package thiss;

public class Customer {
    private String firstName;
    private String lastNAme;
    private Account account;

    public Customer(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public String customerInfo(Account account){
        String info = "\nCustomer：["+this.getFirstName()+this.getLastNAme()+"] 的账户信息如下: \n"+
                "账号: "+account.getId()+"\n余额: "+account.getBalance()+"元\n"+
                "年利率: "+(account.getAnnuallnterestRate()*100)+"%";
        return info;
    }
}
