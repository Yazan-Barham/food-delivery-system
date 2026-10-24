import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int counter = 1000;

    private int orderNumber;
    private String customerName;
    private List<OrderLine> lines = new ArrayList<>();
    private OrderStatus status;
    private DeliveryOption delivery;

    public Order(String customerName, DeliveryOption delivery) {
        this.orderNumber = counter++;
        this.customerName = customerName;
        this.delivery = delivery;
        this.status = OrderStatus.NEW;
    }

    public void addItem(MenuItem item) {
        addItem(item, 1);
    }

    public void addItem(MenuItem item, int qty) {
        ensureModifiable();
        lines.add(new OrderLine(item, qty));
    }

    public double getSubtotal() {
        double sum = 0;
        for (OrderLine line : lines) sum += line.getLineTotal();
        return sum;
    }

    public double getTotal() {
        return getSubtotal() + delivery.getFee();
    }

    public void pay(PaymentMethod method) {
        if (status != OrderStatus.NEW)
            throw new IllegalStateException("Only NEW orders can be paid.");
        method.pay(getTotal());
        status = OrderStatus.PAID;
    }

    public void deliver() {
        if (status != OrderStatus.PAID)
            throw new IllegalStateException("Order must be PAID first.");
        status = OrderStatus.DELIVERED;
    }

    public void cancel() {
        if (status == OrderStatus.DELIVERED)
            throw new IllegalStateException("Delivered order can't be cancelled.");
        status = OrderStatus.CANCELLED;
    }

    private void ensureModifiable() {
        if (status != OrderStatus.NEW)
            throw new IllegalStateException("Order can't be modified.");
    }

    public int getOrderNumber() { return orderNumber; }
    public String getCustomerName() { return customerName; }
    public OrderStatus getStatus() { return status; }
}
