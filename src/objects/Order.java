package objects;

import java.util.Objects;

/**
 * 编写order类，有int型的orderId，String型的orderName，相应的get和set方法，两个参数的构造器，
 * 重写父类的equals方法 并判断测试类中创建的两个对象是否相等
 *
 */
public class Order {
    int orderId;
    String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId &&
//                Objects.equals(orderName, order.orderName);
        if (this == o) return true;
        if (o instanceof Order){
            Order order = (Order)o;
            return this.orderId == order.orderId &&
                    this.orderName.equals(order.orderName);
        }
        return false;
    }

    public static void main(String[] args) {
        Order order = new Order(1,"asd");
        Order order1 = new Order(1,"asd");
        Order order2 = new Order(1,"rty");
        boolean equals = order.equals(order1);
        System.out.println(order.equals(order2));
        System.out.println(equals);
        System.out.println(order == order1);
    }
}
