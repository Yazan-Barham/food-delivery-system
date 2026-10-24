public class Main {
    public static void main(String[] args) {
        Order order = new Order("Yazan", new ExpressDelivery());
        order.addItem(new Meal("Burger", 20, 2));
        order.addItem(new Drink("Cola", 5, true), 2);

        System.out.println("Order #" + order.getOrderNumber());
        System.out.println("Subtotal: " + order.getSubtotal());
        System.out.println("Total: " + order.getTotal());

        order.pay(new CardPayment());
        order.deliver();
        System.out.println("Status: " + order.getStatus());
    }
}
