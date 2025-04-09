public class Tea implements Drink {
    @Override
    public double cost() {
        return 3.0; // Basic tea price
    }

    @Override
    public String getDescription() {
        return "Tea";
    }
}