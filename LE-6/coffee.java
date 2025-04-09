public class Coffee implements Drink {
    @Override
    public double cost() {
        return 5.0; // Basic coffee price
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}