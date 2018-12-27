package com.flyingMachines.model.flyingArtifacts;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wing;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;

import java.util.ArrayList;
import java.util.List;

public class Jet extends FlyingMachine implements Machine {

    private List<Rocket> _rockets = new ArrayList<>();
    private int _rocketQuantity;
    private List<Wing> _wings = new ArrayList<>();

    public Jet(JetBuilder builder) {
        _rockets = builder._rockets;
        _rocketQuantity = builder._rocketQuantity;
        _wings = builder._wings;
        _cabin = builder._cabin;
        _flyingMachineType = builder._flyingMachineType;
        _fuelType = builder._fuelType;
        _fuelQuantity = builder._fuelQuantity;
        _purpose = builder._purpose;
        _rank = builder._rank;
    }

    public static class JetBuilder extends FlyingMachine {
        private List<Rocket> _rockets;
        private int _rocketQuantity;
        private List<Wing> _wings;
        private Cabin _cabin;

        public Jet buildJet() {
            return new Jet(this);
        }

        public static JetBuilder createInstance() {
            return new JetBuilder();
        }

        public JetBuilder rocket(List<Rocket> rockets) {
            _rockets = rockets;
            return this;
        }

        public JetBuilder rocketQuantity(int rocketQuantity) {
            _rocketQuantity = rocketQuantity;
            return this;
        }

        public JetBuilder wings(List<Wing> wings) {
            _wings = wings;
            return this;
        }

        public JetBuilder cabin(Cabin cabin) {
            _cabin = cabin;
            return this;
        }

        public JetBuilder flyingMachineType(FlyingMachineType flyingMachineType) {
            _flyingMachineType = flyingMachineType;
            return this;
        }

        public JetBuilder fuelQuantity(int fuelQuantity) {
            _fuelQuantity = fuelQuantity;
            return this;
        }

        public JetBuilder purpose(Purpose purpose) {
            _purpose = purpose;
            return this;
        }

        public JetBuilder fuelType(Fuel fuelType) {
            _fuelType = fuelType;
            return this;
        }

        public JetBuilder rank(int rank) {
            _rank = rank;
            return this;
        }
    }

    public int getRocketQuantity() {
        return _rocketQuantity;
    }

    public List<Rocket> getRocket() {
        return _rockets;
    }

    public List<Wing> getWings() {
        return _wings;
    }

    @Override
    public void calculateTotalPrice() {
        int price = 0;
        for (Rocket rocket : _rockets) {
            price += rocket.getMaterial().getMaterialPrice();
        }
        for (Wing wing : _wings) {
            price += wing.getMaterial().getMaterialPrice();
        }
        price += _cabin.getMaterial().getMaterialPrice();
        price += _fuelQuantity * _fuelType.getFuelPrice();
        _totalPrice = price;
    }

    @Override
    public void calculateTotalWeight() {
        int weight = 0;
        for (Rocket rocket : _rockets) {
            weight += rocket.getMaterial().getMaterialWeight();
        }
        for (Wing wing : _wings) {
            weight += wing.getMaterial().getMaterialWeight();
        }
        weight += _cabin.getMaterial().getMaterialWeight();
        _totalWeight = weight;
    }
}

