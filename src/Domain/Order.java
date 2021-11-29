package Domain;

import java.util.List;

public class Order {
    private Integer id;
    private String OrderId;
    private List<Product> ProductList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public List<Product> getProductList() {
        return ProductList;
    }

    public void setProductList(List<Product> productList) {
        ProductList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", OrderId='" + OrderId + '\'' +
                ", ProductList=" + ProductList +
                '}';
    }
}
