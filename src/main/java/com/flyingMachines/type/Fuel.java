package com.flyingMachines.type;

public enum Fuel {
    BATERIES(500),
    DIESEL(50),
    GASOLINE(60),
    JET_FUEL(300),
    WATER(25);

    int _price;

    Fuel(int price) {
        _price = price;
    }

    public int getFuelPrice() {
        return _price;
    }
}
