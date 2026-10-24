public class OrderLine {
    private MenuItem item;
    private int quantity;

    public OrderLine(MenuItem item, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be > 0");
        this.item = item;
        this.quantity = quantity;
    }

    public double getLineTotal() {
        return item.getPrice() * quantity;
    }
}
