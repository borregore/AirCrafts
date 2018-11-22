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

    public Plane(PlaneBuilder builder) {
        _propeller = builder._propeller;
        _propellerQuantity = builder._propellerQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
    }

    private static class PlaneBuilder extends FlyingMachine {
        private Propeller _propeller;
        private int _propellerQuantity;
        private Wings _wings;
        private Cabin _cabin;

        public Plane buildPlane() {
            return new Plane(this);
        }

        public PlaneBuilder propeller(Propeller propeller) {
            _propeller = propeller;
            return this;
        }

        public PlaneBuilder propellerQuantity(int propellerQuantity) {
            _propellerQuantity = propellerQuantity;
            return this;
        }

        public PlaneBuilder wings(Wings wings) {
            _wings = wings;
            return this;
        }

        public PlaneBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public PlaneBuilder flyingMachineType(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public PlaneBuilder fuelQuantity(int fuelQuantity) {
            _fuelQuantity = fuelQuantity;
            return this;
        }

        public PlaneBuilder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }

        public PlaneBuilder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public PlaneBuilder rank(int rank) {
            _rank = rank;
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
