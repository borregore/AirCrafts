package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Jet extends FlyingMachine {

    private Rocket _rocket;
    private int _rocketCuantity;
    private Wings _wings;

    public Jet(Builder builder) {
        _rocket = builder._rocket;
        _rocketCuantity = builder._rocketCuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelCuantity = builder._fuelCuantity;
        _purpose = builder._purpose;
    }

    private static class Builder extends FlyingMachine {
        private Rocket _rocket;
        private int _rocketCuantity;
        private Wings _wings;
        private Cabin _cabin;

        public Jet build() {
            return new Jet(this);
        }

        public Builder rocket(Rocket rocket) {
            _rocket = rocket;
            return this;
        }

        public Builder rocketCuantity(int rocketCuantity) {
            _rocketCuantity = rocketCuantity;
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

    public int get_rocketCuantity() {
        return _rocketCuantity;
    }

    public Rocket get_rocket() {
        return _rocket;
    }

    public Wings get_wings() {
        return _wings;
    }
}
