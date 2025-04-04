package ruburgers.ruburgers;

public class Sandwich extends MenuItem {
    protected Bread bread;
    protected Protein protein;
    protected ArrayList<AddOns> addOns;

    @Override
    public double price() {
        return 0;
    }
}