public class CoffeeWithRum implements Drink {
    private Drink drink;

    public CoffeeWithRum(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return drink.cost() + 4.0; // Add rum cost to coffee
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with Rum";
    }
}