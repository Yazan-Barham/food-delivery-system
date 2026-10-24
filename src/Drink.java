public class Drink extends MenuItem {
    private static final double LARGE_EXTRA = 2.0;
    private boolean large;

    public Drink(String name, double basePrice, boolean large) {
        super(name, basePrice);
        this.large = large;
    }

    @Override
    public double getPrice() {
        return large ? getBasePrice() + LARGE_EXTRA : getBasePrice();
    }
}
