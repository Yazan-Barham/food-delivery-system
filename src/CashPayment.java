public class CashPayment implements PaymentMethod {
    @Override
    public double pay(double amount) {
        System.out.println("Paid " + amount + " in cash.");
        return amount;
    }
}
