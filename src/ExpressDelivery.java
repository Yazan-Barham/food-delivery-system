public class ExpressDelivery implements DeliveryOption {
    private static final double FEE = 12.0;

    @Override
    public double getFee() { return FEE; }
}
