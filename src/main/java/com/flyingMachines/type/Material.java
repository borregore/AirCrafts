package com.flyingMachines.type;

public enum Material {
    PLASTIC(15, 10),
    STEEL(180, 100),
    TITANIUM(250, 200),
    WOOD(50, 15);

    int _weight;
    int _price;

    Material(int weight, int price){
        _weight = weight;
        _price = price;
    }

    public int get_weight() {
        return _weight;
    }

    public int get_price() {
        return _price;
    }
}
