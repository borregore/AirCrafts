package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Helicopter extends FlyingMachine {

    private Propeller _propeller;
    private int _propellerQuantity;

    public Helicopter(Builder builder) {
        _propeller = builder._propeller;
        _propellerQuantity = builder._propellerQuantity;
        _flyingMachineType = builder._flyingMachineType;
        _fuelQuantity = builder._fuelQuantity;
        _fuelType = builder._fuelType;
        _purpose = builder._purpose;
    }

    private static class Builder extends FlyingMachine {
        private Cabin _cabin;
        private Propeller _propeller;
        private int _propellerQuantity;

        public Helicopter build() {
            return new Helicopter(this);
        }

        public Builder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public Builder propeller(Propeller propeller) {
            _propeller = propeller;
            return this;
        }

        public Builder propellerQuantity(int propellerQuantity) {
            _propellerQuantity = propellerQuantity;
            return this;
        }

        public Builder flyingMachineTye(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public Builder fuelQuantity(int fuelQuantity) {
            _fuelQuantity = fuelQuantity;
            return this;
        }

        public Builder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public Builder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }
    }

    public Propeller getPropeller() {
        return _propeller;
    }

    public int getPropellerQuantity() {
        return _propellerQuantity;
    }
}
