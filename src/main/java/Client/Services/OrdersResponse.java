package Client.Services;

import Client.Models.OrderItem;
import java.util.List;

public class OrdersResponse  {
    private List<OrderItem> purchased;
    private List<OrderItem> sold;

    public OrdersResponse () {}

    public List<OrderItem> getPurchased() {
        return purchased;
    }

    public List<OrderItem> getSold() {
        return sold;
    }
}
