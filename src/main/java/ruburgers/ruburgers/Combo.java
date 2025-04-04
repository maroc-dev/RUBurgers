package ruburgers.ruburgers;

public class Combo extends MenuItem{
    private Sandwich sandwich;
    private Beverage drink;
    private Side side;

    @Override
    public double price() {
        return 0;
    }
}