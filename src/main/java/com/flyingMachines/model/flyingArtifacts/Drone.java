package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Drone extends FlyingMachine {

    private Propeller _propeller;
    private int _propellerQuantity;

    public Drone(DroneBuilder builder) {
        _cabin = builder._cabin;
        _propeller = builder._propeller;
        _propellerQuantity = builder._propellerQuantity;
        _flyingMachineType = builder._flyingMachineType;
        _fuelQuantity = builder._fuelQuantity;
        _fuelType = builder._fuelType;
        _purpose = builder._purpose;
    }

    private static class DroneBuilder extends FlyingMachine {
        private Cabin _cabin;
        private Propeller _propeller;
        private int _propellerQuantity;

        public Drone buildDroneFlyingMachineFactory() {
            return new Drone(this);
        }

        public DroneBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public DroneBuilder propeller(Propeller propeller) {
            _propeller = propeller;
            return this;
        }

        public DroneBuilder propellerQuantity(int propellerQuantity) {
            _propellerQuantity = propellerQuantity;
            return this;
        }

        public DroneBuilder flyingMachineTye(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public DroneBuilder fuelQuantity(int fuelQuantity) {
            _fuelQuantity = fuelQuantity;
            return this;
        }

        public DroneBuilder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public DroneBuilder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }

        public DroneBuilder rank(int rank) {
            _rank = rank;
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
