package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wing;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

import java.util.ArrayList;
import java.util.List;

public class SpaceRocket extends FlyingMachine implements Machine {

    private List<Rocket> _rockets = new ArrayList<>();
    private int _rocketQuantity;
    private List<Wing> _wings = new ArrayList<>();

    public SpaceRocket(SpaceRocketBuilder builder) {
        _rockets = builder.rockets;
        _rocketQuantity = builder._rocketQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
        _rank = builder._rank;
    }

    public static class SpaceRocketBuilder extends FlyingMachine {
        private List<Rocket> rockets;
        private int _rocketQuantity;
        private List<Wing> _wings;
        private Cabin _cabin;

        public SpaceRocket buildSpaceRocket() {
            return new SpaceRocket(this);
        }

        public static SpaceRocketBuilder createInstance() {
            return new SpaceRocketBuilder();
        }

        public SpaceRocketBuilder rockets(List<Rocket> rockets) {
            rockets = rockets;
            return this;
        }

        public SpaceRocketBuilder rocketQuantity(int rocketCuantity) {
            _rocketQuantity = rocketCuantity;
            return this;
        }

        public SpaceRocketBuilder wings(List<Wing> wings) {
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

    public List<Rocket> getRockets() {
        return _rockets;
    }

    public List<Wing> getWings() {
        return _wings;
    }

    @Override
    public void calculateTotalPrice() {
        int price = 0;
        /*for(Rocket rocket : _rockets){
            price += rocket.getMaterial().getMaterialPrice();
        }
        for(Wing wing : _wings){
            price += wing.getMaterial().getMaterialPrice();
        }*/
        price += _cabin.getMaterial().getMaterialPrice();
        price += _fuelQuantity * _fuelType.getFuelPrice();
        _totalPrice = price;
    }

    @Override
    public void calculateTotalWeight() {
        int weight = 0;
        /*for(Rocket rocket : _rockets){
            weight += rocket.getMaterial().getMaterialWeight();
        }*/
        for(Wing wing : _wings){
            weight += wing.getMaterial().getMaterialWeight();
        }
        weight += _cabin.getMaterial().getMaterialWeight();
        _totalWeight = weight;
    }
}
