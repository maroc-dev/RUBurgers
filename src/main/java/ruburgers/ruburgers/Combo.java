package ruburgers.ruburgers;

public class Combo extends MenuItem{
    private Sandwich sandwich;
    private Beverage drink;
    private Side side;

    public Combo(Sandwich sandwich, Beverage drink, Side side) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.side = side;
    }

    @Override
    public double price() {
        double comboPrice = sandwich.price() + drink.price() + side.getPriceBySize(Size.SMALL);
        return comboPrice - 1.00;
    }
    @Override
    public String toString() {
        return "Combo Meal: \n" +
                "- " + sandwich.toString() + "\n" +
                "- " + side.toString() + "\n" +
                "- " + drink.toString() + "\n" +
                "Total Price: $" + String.format("%.2f", price());
    }
}