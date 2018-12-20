package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

public class Helicopter extends FlyingMachine {

    private Propeller _propeller;
    private int _propellerQuantity;

    public Helicopter(HelicopterBuilder builder) {
        _propeller = builder._propeller;
        _propellerQuantity = builder._propellerQuantity;
        _flyingMachineType = builder._flyingMachineType;
        _fuelQuantity = builder._fuelQuantity;
        _fuelType = builder._fuelType;
        _purpose = builder._purpose;
    }

    public static class HelicopterBuilder extends FlyingMachine {
        private Cabin _cabin;
        private Propeller _propeller;
        private int _propellerQuantity;

        public Helicopter buildHelicopter() {
            return new Helicopter(this);
        }

        public static HelicopterBuilder createInstance(){
            return new HelicopterBuilder();
        }

        public HelicopterBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public HelicopterBuilder propeller(Propeller propeller) {
            _propeller = propeller;
            return this;
        }

        public HelicopterBuilder propellerQuantity(int propellerQuantity) {
            _propellerQuantity = propellerQuantity;
            return this;
        }

        public HelicopterBuilder flyingMachineTye(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public HelicopterBuilder fuelQuantity(int fuelQuantity) {
            _fuelQuantity = fuelQuantity;
            return this;
        }

        public HelicopterBuilder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public HelicopterBuilder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }

        public HelicopterBuilder rank(int rank) {
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
