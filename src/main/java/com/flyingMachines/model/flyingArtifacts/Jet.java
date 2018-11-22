package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Jet extends FlyingMachine {

    private Rocket _rocket;
    private int _rocketQuantity;
    private Wings _wings;

    public Jet(Builder builder) {
        _rocket = builder._rocket;
        _rocketQuantity = builder._rocketQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
    }

    private static class Builder extends FlyingMachine {
        private Rocket _rocket;
        private int _rocketQuantity;
        private Wings _wings;
        private Cabin _cabin;

        public Jet buildJet() {
            return new Jet(this);
        }

        public Builder rocket(Rocket rocket) {
            _rocket = rocket;
            return this;
        }

        public Builder rocketQuantity(int rocketQuantity) {
            _rocketQuantity = rocketQuantity;
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

    public int getRocketQuantity() {
        return _rocketQuantity;
    }

    public Rocket getRocket() {
        return _rocket;
    }

    public Wings getWings() {
        return _wings;
    }
}

