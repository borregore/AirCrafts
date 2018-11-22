package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class SpaceRocket extends FlyingMachine {

    private Rocket _rocket;
    private int _rocketQuantity;
    private Wings _wings;

    public SpaceRocket(SpaceRocketBuilder builder) {
        _rocket = builder._rocket;
        _rocketQuantity = builder._rocketQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
    }

    private static class SpaceRocketBuilder extends FlyingMachine {
        private Rocket _rocket;
        private int _rocketQuantity;
        private Wings _wings;
        private Cabin _cabin;

        public SpaceRocket buildSpaceRocket() {
            return new SpaceRocket(this);
        }

        public SpaceRocketBuilder rocket(Rocket rocket) {
            _rocket = rocket;
            return this;
        }

        public SpaceRocketBuilder rocketQuantity(int rocketCuantity) {
            _rocketQuantity = rocketCuantity;
            return this;
        }

        public SpaceRocketBuilder wings(Wings wings) {
            _wings = wings;
            return this;
        }

        public SpaceRocketBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public SpaceRocketBuilder flyingMachineType(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public SpaceRocketBuilder fuelQuantity(int fuelCuantity) {
            _fuelQuantity = fuelCuantity;
            return this;
        }

        public SpaceRocketBuilder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }

        public SpaceRocketBuilder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public SpaceRocketBuilder rank(int rank) {
            _rank = rank;
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
