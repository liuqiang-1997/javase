package project2;

/**
 * customer对象的管理模块，
 * 内部使用数组管理一组Customer对象，
 * 并提供增删改查的方法供CustomerView类调用
 */
public class CustomerList {
    private Customer[] customers;  //保存客户对象的数组
    private int total = 0;  //保存客户数

    /**
     * 初始化customer数组的构造器
     * @param totalCustomer 指定数组长度
     */
    public CustomerList(int totalCustomer) {
         customers = new Customer[totalCustomer];
    }

    /**
     * 获取存储客户数量
     * @return total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 获取所有客户信息
     * @return 对象
     */
    public Customer[] getAllCustomers() {
        Customer[] customer = new Customer[total];
        for (int i = 0; i < customer.length; i++) {
            customer[i] = customers[i];
        }
        return customer;
    }

    /**
     * 索取指定索引位置上的客户
     * @param index
     * @return 找到返回对象，找不到返回null
     */
    public Customer getCustomers(int index) {
        if (index<0||index>=total){
            return null;
        }
        return customers[index];
    }

    /**
     * 删除指定位置客户
     * @param index 位置索引
     * @return true成功；false失败
     */
    public boolean deleteCustomer(int index){
        if (index <0 || index >=total){
            System.out.println("该索引位置无用户");
            return false;
        }else{
            System.out.println("用户"+customers[index].getName()+"删除成功");
            // 删除成功后将剩余元素索引加一
            for (int i = index; i <customers.length-1 ; i++) {
                customers[i] = customers[i+1];
            }
            customers[--total] = null;  // 最后一个元素置空
            return true;
        }
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index 位置索引
     * @param customer 客户对象
     * @return true成功；false失败
     */
    public boolean replaceCustomer(int index,Customer customer){
        if (index<0 || index>=customers.length){
            System.out.println("该索引位置无用户");
            return false;
        }else{
            customers[index] = customer;
            System.out.println("用户"+customers[index].getName()+"修改成功");
            return true;
        }
    }

    /**
     * 将指定客户添加到客户数组中
     * @param customer 客户对象
     * @return true成功，false失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }else{
            customers[total++] = customer;
            return true;
        }

    }

}
