package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Wing;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

import java.util.ArrayList;
import java.util.List;

public class Plane extends FlyingMachine implements Machine {

    private List<Propeller> _propellers = new ArrayList<>();
    private int _propellerQuantity;
    private List<Wing> _wings = new ArrayList<>();

    public Plane(PlaneBuilder builder) {
        _propellers = builder._propellers;
        _propellerQuantity = builder._propellerQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
        _rank = builder._rank;
    }

    private static class PlaneBuilder extends FlyingMachine {
        private List<Propeller> _propellers;
        private int _propellerQuantity;
        private List<Wing> _wings;
        private Cabin _cabin;

        public Plane buildPlane() {
            return new Plane(this);
        }

        public PlaneBuilder propeller(List<Propeller> propellers) {
            _propellers = propellers;
            return this;
        }

        public PlaneBuilder propellerQuantity(int propellerQuantity) {
            _propellerQuantity = propellerQuantity;
            return this;
        }

        public PlaneBuilder wings(List<Wing> wings) {
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

    public List<Propeller> getPropellers() {
        return _propellers;
    }

    public List<Wing> getWings() {
        return _wings;
    }

    @Override
    public void calculateTotalPrice() {
        int price = 0;
        for(Propeller propeller : _propellers){
            price += propeller.getMaterial().getMaterialPrice();
        }
        for(Wing wing :  _wings){
            price += wing.getMaterial().getMaterialPrice();
        }
        price += _cabin.getMaterial().getMaterialPrice();
        price += _fuelQuantity * _fuelType.getFuelPrice();
        _totalPrice = price;
    }

    @Override
    public void calculateTotalWeight() {
        int weight = 0;
        for(Propeller propeller : _propellers){
            weight += propeller.getMaterial().getMaterialWeight();
        }
        for(Wing wing : _wings){
            weight += wing.getMaterial().getMaterialWeight();
        }
        weight += _cabin.getMaterial().getMaterialWeight();
        _totalWeight = weight;
    }
}
