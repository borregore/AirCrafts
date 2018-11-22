package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class FlyingMachine {

    Cabin _cabin;
    FlyingMachineType _flyingMachineType;
    int _fuelQuantity;
    Fuel _fuelType;
    Purpose _purpose;
    int _rank;

    public FlyingMachineType getFlyingMachineType() {
        return _flyingMachineType;
    }

    public int getFuelCuantity() {
        return _fuelQuantity;
    }

    public Purpose getPurpose() {
        return _purpose;
    }

    public Fuel getFuelType() {
        return _fuelType;
    }

    public Cabin getCabin() {
        return _cabin;
    }

    public int getRank() {
        return _rank;
    }
}
