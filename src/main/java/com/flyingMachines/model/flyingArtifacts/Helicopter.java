package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Helicopter extends FlyingMachine {

    private Propeller _propeller;
    private int _propellerCuantity;

    public Helicopter(Builder builder) {
        _propeller = builder._propeller;
        _propellerCuantity = builder._propellerCuantity;
        _flyingMachineType = builder._flyingMachineType;
        _fuelCuantity = builder._fuelCuantity;
        _fuelType = builder._fuelType;
        _purpose = builder._purpose;
    }

    private static class Builder extends FlyingMachine {
        private Cabin _cabin;
        private Propeller _propeller;
        private int _propellerCuantity;

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

        public Builder propellerCuantity(int propellerCuantity) {
            _propellerCuantity = propellerCuantity;
            return this;
        }

        public Builder flyingMachineTye(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public Builder fuelCuantity(int fuelCuantity) {
            _fuelCuantity = fuelCuantity;
            return this;
        }

        public Builder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public Builder _purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }
    }

    public Propeller get_propeller() {
        return _propeller;
    }

    public int get_propellerCuantity() {
        return _propellerCuantity;
    }
}
