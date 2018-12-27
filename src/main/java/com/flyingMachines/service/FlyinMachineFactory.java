package com.flyingMachines.service;

import com.flyingMachines.model.flyingArtifacts.*;
import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wing;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Set;

public class FlyinMachineFactory {
    private final static String CABIN = "cabin";
    private final static String PROPELLERS = "propellers";
    private final static String WINGS = "wings";
    private final static String FUEL_TYPE = "fuelType";
    private final static String FUEL_CAPACITY = "fuelCapacity";
    private final static String PURPOSE = "categoryType";
    private final static String RANK = "rank";
    private final static String ROCKETS = "rockets";
    private final static String TYPE = "airshipType";

    FlyingMachineEngine engine = new FlyingMachineEngine();

    public FlyingMachine createFlyingMachine(FlyingMachineType machineType, JSONObject json) {
        switch (machineType) {
            case AIRPLANE:
                return createAirplane(json);
            case DRONE:
                return createDrone(json);
            case HELICOPTER:
                return createHelicopter(json);
            case JET:
                return createJet(json);
            case SPACE_ROCKET:
                return createSpaceRocket(json);
            default:
                return null;
        }
    }


    private FlyingMachine createAirplane(JSONObject inputValues) {
        AirPlane.AirPlaneBuilder airplaneBuilder = AirPlane.AirPlaneBuilder.createInstance();

        Set airshipParts = inputValues.keySet();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = engine.createCabin(inputValues);
                    airplaneBuilder.cabin(cabin);
                    break;
                case TYPE:
                    FlyingMachineType machineType = engine.chooseFlyingMachine(inputValues);
                    airplaneBuilder.flyingMachineType(machineType);
                    break;
                case PROPELLERS:
                    List<Propeller> propellers = engine.getPropellersFromJSON(inputValues);
                    airplaneBuilder.propeller(propellers);
                    break;
                case WINGS:
                    List<Wing> wings = engine.getWingsFromJSON(inputValues);
                    airplaneBuilder.wings(wings);
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    airplaneBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = Integer.parseInt(inputValues.get("fuelCapacity").toString());
                    airplaneBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    airplaneBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = Integer.parseInt(inputValues.get("rank").toString());
                    airplaneBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        AirPlane airPlane = airplaneBuilder.buildAirplane();
        airPlane.calculateTotalPrice();
        airPlane.calculateTotalWeight();
        return airPlane;
    }

    private FlyingMachine createDrone(JSONObject inputValues) {
        Drone.DroneBuilder droneBuilder = Drone.DroneBuilder.createInstance();

        Set airshipParts = inputValues.keySet();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = engine.createCabin(inputValues);
                    droneBuilder.cabin(cabin);
                    break;
                case TYPE:
                    FlyingMachineType machineType = engine.chooseFlyingMachine(inputValues);
                    droneBuilder.flyingMachineTye(machineType);
                    break;
                case PROPELLERS:
                    List<Propeller> propellers = engine.getPropellersFromJSON(inputValues);
                    droneBuilder.propeller(propellers);
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    droneBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = Integer.parseInt(inputValues.get("fuelCapacity").toString());
                    droneBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    droneBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = Integer.parseInt(inputValues.get("rank").toString());
                    droneBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        Drone drone = droneBuilder.buildDrone();
        drone.calculateTotalPrice();;
        drone.calculateTotalWeight();;
        return drone;
    }

    private FlyingMachine createHelicopter(JSONObject inputValues) {
        Helicopter.HelicopterBuilder helicopterBuilder = Helicopter.HelicopterBuilder.createInstance();

        Set airshipParts = inputValues.keySet();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = engine.createCabin(inputValues);
                    helicopterBuilder.cabin(cabin);
                    break;
                case TYPE:
                    FlyingMachineType machineType = engine.chooseFlyingMachine(inputValues);
                    helicopterBuilder.flyingMachineTye(machineType);
                    break;
                case PROPELLERS:
                    List<Propeller> propellers = engine.getPropellersFromJSON(inputValues);
                    helicopterBuilder.propeller(propellers);
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    helicopterBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = Integer.parseInt(inputValues.get("fuelCapacity").toString());
                    helicopterBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    helicopterBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = Integer.parseInt(inputValues.get("rank").toString());
                    helicopterBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        Helicopter helicopter = helicopterBuilder.buildHelicopter();
        helicopter.calculateTotalPrice();
        helicopter.calculateTotalWeight();
        return helicopter;
    }

    private FlyingMachine createJet(JSONObject inputValues) {
        Jet.JetBuilder jetBuilder = Jet.JetBuilder.createInstance();

        Set airshipParts = inputValues.keySet();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = engine.createCabin(inputValues);
                    jetBuilder.cabin(cabin);
                    break;
                case TYPE:
                    FlyingMachineType machineType = engine.chooseFlyingMachine(inputValues);
                    jetBuilder.flyingMachineType(machineType);
                    break;
                case WINGS:
                    List<Wing> wings = engine.getWingsFromJSON(inputValues);
                    jetBuilder.wings(wings);
                    break;
                case ROCKETS:
                    List<Rocket> rockets = engine.getRocketsFromJSON(inputValues);
                    jetBuilder.rocket(rockets);
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    jetBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = Integer.parseInt(inputValues.get("fuelCapacity").toString());
                    jetBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    jetBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = Integer.parseInt(inputValues.get("rank").toString());
                    jetBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        Jet jet = jetBuilder.buildJet();
        jet.calculateTotalPrice();
        jet.calculateTotalWeight();
        return jet;
    }

    private FlyingMachine createSpaceRocket(JSONObject inputValues) {
        SpaceRocket.SpaceRocketBuilder spaceRocketBuilder = SpaceRocket.SpaceRocketBuilder.createInstance();

        Set airshipParts = inputValues.keySet();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = engine.createCabin(inputValues);
                    spaceRocketBuilder.cabin(cabin);
                    break;
                case TYPE:
                    FlyingMachineType machineType = engine.chooseFlyingMachine(inputValues);
                    spaceRocketBuilder.flyingMachineType(machineType);
                    break;
                case WINGS:
                    List<Wing> wings = engine.getWingsFromJSON(inputValues);
                    spaceRocketBuilder.wings(wings);
                    break;
                case ROCKETS:
                    List<Rocket> rockets = engine.getRocketsFromJSON(inputValues);
                    spaceRocketBuilder.rockets(rockets);
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    spaceRocketBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = Integer.parseInt(inputValues.get("fuelCapacity").toString());
                    spaceRocketBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    spaceRocketBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = Integer.parseInt(inputValues.get("rank").toString());
                    spaceRocketBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        SpaceRocket spaceRocket = spaceRocketBuilder.buildSpaceRocket();
        spaceRocket.calculateTotalPrice();
        spaceRocket.calculateTotalWeight();
        return spaceRocket;
    }
}
