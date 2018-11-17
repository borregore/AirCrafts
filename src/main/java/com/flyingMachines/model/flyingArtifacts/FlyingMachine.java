package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

class FlyingMachine {

    Cabin _cabin;
    FlyingMachineType _flyingMachineType;
    int _fuelCuantity;
    Fuel _fuelType;
    Purpose _purpose;

    public FlyingMachineType get_flyingMachineType() {
        return _flyingMachineType;
    }

    public int get_fuelCuantity() {
        return _fuelCuantity;
    }

    public Purpose get_purpose() {
        return _purpose;
    }

    public Fuel get_fuelType() {
        return _fuelType;
    }

    public Cabin get_cabin() {
        return _cabin;
    }
}
