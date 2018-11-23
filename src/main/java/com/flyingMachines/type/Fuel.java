package com.flyingMachines.type;

public enum Fuel {
    BATTERY(500),
    DIESEL(50),
    GASOLINE(60),
    AIR_FUEL(300),
    WATER(25);

    private final int _price;

    Fuel(int price) {
        _price = price;
    }

    public int getFuelPrice() {
        return _price;
    }
}
