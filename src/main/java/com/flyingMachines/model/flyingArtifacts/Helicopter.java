package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

import java.util.ArrayList;
import java.util.List;

public class Helicopter extends FlyingMachine implements Machine {

    private List<Propeller> _propellers = new ArrayList<>();
    private int _propellerQuantity;

    public Helicopter(HelicopterBuilder builder) {
        _propellers = builder._propellers;
        _propellerQuantity = builder._propellerQuantity;
        _flyingMachineType = builder._flyingMachineType;
        _fuelQuantity = builder._fuelQuantity;
        _fuelType = builder._fuelType;
        _purpose = builder._purpose;
        _rank = builder._rank;
        _cabin = builder._cabin;
    }

    public static class HelicopterBuilder extends FlyingMachine {
        private Cabin _cabin;
        private List<Propeller> _propellers;
        private int _propellerQuantity;

        public Helicopter buildHelicopter() {
            return new Helicopter(this);
        }

        public static HelicopterBuilder createInstance() {
            return new HelicopterBuilder();
        }

        public HelicopterBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public HelicopterBuilder propeller(List<Propeller> propellers) {
            _propellers = propellers;
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
