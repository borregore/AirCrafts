package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

import java.util.ArrayList;
import java.util.List;

public class Drone extends FlyingMachine implements Machine {

    private List<Propeller> _propellers = new ArrayList<>();
    private int _propellerQuantity;

    public Drone(DroneBuilder builder) {
        _cabin = builder._cabin;
        _propellers = builder._propellers;
        _propellerQuantity = builder._propellerQuantity;
        _flyingMachineType = builder._flyingMachineType;
        _fuelQuantity = builder._fuelQuantity;
        _fuelType = builder._fuelType;
        _purpose = builder._purpose;
        _rank = builder._rank;
    }

    public static class DroneBuilder extends FlyingMachine {
        private Cabin _cabin;
        private List<Propeller> _propellers;
        private int _propellerQuantity;

        public Drone buildDrone() {
            return new Drone(this);
        }

        public static DroneBuilder createInstance() {
            return new DroneBuilder();
        }

        public DroneBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public DroneBuilder propeller(List<Propeller> propellers) {
            _propellers = propellers;
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

    public List<Propeller> getPropeller() {
        return _propellers;
    }

    public int getPropellerQuantity() {
        return _propellerQuantity;
    }

    @Override
    public void calculateTotalPrice() {
        int price = 0;
        for (Propeller propeller : _propellers) {
            price += propeller.getMaterial().getMaterialPrice();
        }
        price += _cabin.getMaterial().getMaterialPrice();
        price += _fuelQuantity * _fuelType.getFuelPrice();
        _totalPrice = price;
    }

    @Override
    public void calculateTotalWeight() {
        int weight = 0;
        for (Propeller propeller : _propellers) {
            weight += propeller.getMaterial().getMaterialWeight();
        }
        weight += _cabin.getMaterial().getMaterialWeight();
        _totalWeight = weight;
    }
}
