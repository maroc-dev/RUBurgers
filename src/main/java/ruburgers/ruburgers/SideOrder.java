package ruburgers.ruburgers;

public class SideOrder extends MenuItem {
    private Side type;
    private Size size;

    public SideOrder(Side type, Size size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public double price() {
        return type.getPriceBySize(size);
    }

    @Override
    public String toString() {
        return size + " " + type.name().replace("_", " ") + " ($" +
                String.format("%.2f", price()) + ")";
    }

}
