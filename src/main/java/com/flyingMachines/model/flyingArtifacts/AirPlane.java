package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class AirPlane extends FlyingMachine {

    private Propeller _propeller;
    private int _propellerCuantity;
    private Wings _wings;

    public AirPlane(Builder builder) {
        _propeller = builder._propeller;
        _propellerCuantity = builder._propellerCuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelCuantity = builder._fuelCuantity;
        _purpose = builder._purpose;
    }

    private static class Builder extends FlyingMachine {
        private Propeller _propeller;
        private int _propellerCuantity;
        private Wings _wings;
        private Cabin _cabin;

        public AirPlane build() {
            return new AirPlane(this);
        }

        public Builder propeller(Propeller propeller) {
            _propeller = propeller;
            return this;
        }

        public Builder propellerCuantity(int propellerCuantity) {
            _propellerCuantity = propellerCuantity;
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

        public Builder fuelCuantity(int fuelCuantity) {
            _fuelCuantity = fuelCuantity;
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

    public Propeller get_propeller() {
        return _propeller;
    }

    public Wings get_wings() {
        return _wings;
    }
}
