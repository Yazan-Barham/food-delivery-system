public abstract class MenuItem {
    private String name;
    private double basePrice;

    protected MenuItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }

    public abstract double getPrice();
}
