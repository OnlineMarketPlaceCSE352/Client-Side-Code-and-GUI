package Client.Models;

public class OrderItem {
    private int productId;
    private double price;

    public OrderItem() {
        this.price=0.0;
        this.productId=-1;
    }

    public OrderItem(int productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
