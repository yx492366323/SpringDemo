package Domain;

import java.util.List;

public class UserTwo {
    private Integer Id;
    private String Name;
    private Integer Age;
    private List<Order> OrderList;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public List<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(List<Order> orderList) {
        OrderList = orderList;
    }

    @Override
    public String toString() {
        return "UserTwo{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", OrderList=" + OrderList +
                '}';
    }
}
