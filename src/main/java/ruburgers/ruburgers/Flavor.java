package ruburgers.ruburgers;

public enum Flavor {
    COLA,
    LEMONADE,
    ROOT_BEER,
    ORANGE,
    SPRITE,
    CHERRY,
    GRAPE,
    BLUE_RASPBERRY,
    MANGO,
    STRAWBERRY,
    PEACH,
    WATERMELON,
    LIME,
    VANILLA,
    PINEAPPLE;

    @Override
    public String toString() {
        return name().toLowerCase().replace("_", " ").replaceFirst(".", name().charAt(0) + "");
    }
}
