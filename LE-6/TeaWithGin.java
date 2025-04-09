public class TeaWithGin implements Drink {
    private Drink drink;

    public TeaWithGin(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return drink.cost() + 3.5; // Add gin cost to tea
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with Gin";
    }
}