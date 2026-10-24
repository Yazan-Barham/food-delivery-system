public class CardPayment implements PaymentMethod {
    private static final double FEE = 0.02;

    @Override
    public double pay(double amount) {
        double total = amount + amount * FEE;
        System.out.println("Paid " + total + " by card (incl. 2% fee).");
        return total;
    }
}
