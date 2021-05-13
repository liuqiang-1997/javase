package thiss;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer ;

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 添加客户
     * @param x 客户姓
     * @param m 客户名
     */
    public void addCustomer(String x,String m){
        Customer customer = new Customer(x,m);
        customers[numberOfCustomer++] = customer;

    }

    /**
     * 获取指定位置客户
     * @param index int 客户所在数组位置索引
     * @return 客户
     */
    public Customer getCustomers(int index) {
        if(index<=customers.length && index>=0) {
            return customers[index];
        }else{
            throw new RuntimeException("该位置客户不存在");
        }
    }
    /**
     * 获取客户个数
     * @return 个数
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
