package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Plane extends FlyingMachine {

    private Propeller _propeller;
    private int _propellerQuantity;
    private Wings _wings;

    public Plane(Builder builder) {
        _propeller = builder._propeller;
        _propellerQuantity = builder._propellerQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
    }

    private static class Builder extends FlyingMachine {
        private Propeller _propeller;
        private int _propellerQuantity;
        private Wings _wings;
        private Cabin _cabin;

        public Plane buildPlane() {
            return new Plane(this);
        }

        public Builder propeller(Propeller propeller) {
            _propeller = propeller;
            return this;
        }

        public Builder propellerQuantity(int propellerQuantity) {
            _propellerQuantity = propellerQuantity;
            return this;
        }

        public Builder wings(Wings wings) {
            _wings = wings;
            return this;
        }

        public Builder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public Builder flyingMachineType(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public Builder fuelQuantity(int fuelQuantity) {
            _fuelQuantity = fuelQuantity;
            return this;
        }

        public Builder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }

        public Builder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }
    }

    public Propeller getPropeller() {
        return _propeller;
    }

    public Wings getWings() {
        return _wings;
    }
}
