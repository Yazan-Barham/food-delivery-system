public class StandardDelivery implements DeliveryOption {
    private static final double FEE = 5.0;

    @Override
    public double getFee() { return FEE; }
}
