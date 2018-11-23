package com.flyingMachines.type;

public enum Material {
    PLASTIC(15, 10),
    STEEL(180, 100),
    TITANIUM(250, 200),
    WOOD(50, 15);

    private final int _weight;
    private final int _price;

    Material(int weight, int price){
        _weight = weight;
        _price = price;
    }

    public int getMaterialWeight() {
        return _weight;
    }

    public int getMaterialPrice() {
        return _price;
    }
}
