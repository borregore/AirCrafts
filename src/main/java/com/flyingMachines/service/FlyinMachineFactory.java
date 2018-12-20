package com.flyingMachines.service;

import com.flyingMachines.model.flyingArtifacts.*;
import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Purpose;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.Set;

public class FlyinMachineFactory {
    private final static String CABIN = "cabn";
    private final static String PROPELLERS = "propellers";
    private final static String WINGS = "wings";
    private final static String FUEL_TYPE = "fuelType";
    private final static String FUEL_CAPACITY = "fuelCapacity";
    private final static String PURPOSE = "cetgoryType";
    private final static String RANK = "rank";

    FlyingMachineEngine engine = new FlyingMachineEngine();

    public FlyingMachine createFlyingMachine(FlyingMachineType machineType, JSONObject json) throws JSONException {
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


    private FlyingMachine createAirplane(JSONObject inputValues) throws JSONException {
        AirPlane.AirPlaneBuilder airplaneBuilder = AirPlane.AirPlaneBuilder.createInstance();

        Set airshipParts = (Set) inputValues.keys();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = createCabin(inputValues);
                    airplaneBuilder.cabin(cabin);
                    break;
                case PROPELLERS:
                    Propeller[] propellers = engine.getPropellersFromJSON(inputValues);
                    for(Propeller propeller : propellers){
                        airplaneBuilder.propeller(propeller);
                    }
                    break;
                case WINGS:
                    Wings[] wings = engine.getWingsFromJSON(inputValues);
                    for(Wings wing : wings){
                        airplaneBuilder.wings(wing);
                    }
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    airplaneBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = (Integer) inputValues.get("fuelCapacity");
                    airplaneBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    airplaneBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = (Integer) inputValues.get("rank");
                    airplaneBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        return airplaneBuilder.buildAirplane();
    }

    private FlyingMachine createDrone(JSONObject inputValues) throws JSONException {
        Drone.DroneBuilder droneBuilder = Drone.DroneBuilder.createInstance();

        Set airshipParts = (Set) inputValues.keys();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = createCabin(inputValues);
                    droneBuilder.cabin(cabin);
                    break;
                case PROPELLERS:
                    Propeller[] propellers = engine.getPropellersFromJSON(inputValues);
                    for(Propeller propeller : propellers){
                        droneBuilder.propeller(propeller);
                    }
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    droneBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = (Integer) inputValues.get("fuelCapacity");
                    droneBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    droneBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = (Integer) inputValues.get("rank");
                    droneBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        return droneBuilder.buildDrone();
    }

    private FlyingMachine createHelicopter(JSONObject inputValues) throws JSONException {
        Helicopter.HelicopterBuilder helicopterBuilder = Helicopter.HelicopterBuilder.createInstance();

        Set airshipParts = (Set) inputValues.keys();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = createCabin(inputValues);
                    helicopterBuilder.cabin(cabin);
                    break;
                case PROPELLERS:
                    Propeller[] propellers = engine.getPropellersFromJSON(inputValues);
                    for(Propeller propeller : propellers){
                        helicopterBuilder.propeller(propeller);
                    }
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    helicopterBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = (Integer) inputValues.get("fuelCapacity");
                    helicopterBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    helicopterBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = (Integer) inputValues.get("rank");
                    helicopterBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        return helicopterBuilder.buildHelicopter();
    }

    private FlyingMachine createJet(JSONObject inputValues) throws JSONException {
        Jet.JetBuilder jetBuilder = Jet.JetBuilder.createInstance();

        Set airshipParts = (Set) inputValues.keys();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = createCabin(inputValues);
                    jetBuilder.cabin(cabin);
                    break;
                case WINGS:
                    Wings[] wings = engine.getWingsFromJSON(inputValues);
                    for(Wings wing : wings){
                        jetBuilder.wings(wing);
                    }
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    jetBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = (Integer) inputValues.get("fuelCapacity");
                    jetBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    jetBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = (Integer) inputValues.get("rank");
                    jetBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        return jetBuilder.buildJet();
    }

    private FlyingMachine createSpaceRocket(JSONObject inputValues) throws JSONException {
        SpaceRocket.SpaceRocketBuilder spaceRocketBuilder = SpaceRocket.SpaceRocketBuilder.createInstance();

        Set airshipParts = (Set) inputValues.keys();
        for (Object airshipPart : airshipParts) {
            String partType = (String) airshipPart;
            switch (partType) {
                case CABIN:
                    Cabin cabin = createCabin(inputValues);
                    spaceRocketBuilder.cabin(cabin);
                    break;
                case WINGS:
                    Wings[] wings = engine.getWingsFromJSON(inputValues);
                    for(Wings wing : wings){
                        spaceRocketBuilder.wings(wing);
                    }
                    break;
                case FUEL_TYPE:
                    Fuel fuelType = engine.getFuelTypeFromJSON(inputValues);
                    spaceRocketBuilder.fuelType(fuelType);
                    break;
                case FUEL_CAPACITY:
                    Integer fuelCapacity = (Integer) inputValues.get("fuelCapacity");
                    spaceRocketBuilder.fuelQuantity(fuelCapacity);
                    break;
                case PURPOSE:
                    Purpose purpose = engine.choosePurpose(inputValues);
                    spaceRocketBuilder.purpose(purpose);
                    break;
                case RANK:
                    Integer rank = (Integer) inputValues.get("rank");
                    spaceRocketBuilder.rank(rank);
                    break;
                default:
                    break;
            }
        }

        return spaceRocketBuilder.buildSpaceRocket();
    }

    private Cabin createCabin(JSONObject inputValues) throws JSONException {
        JSONObject cabinJSON = (JSONObject) inputValues.get("cabin");
        return new Cabin(engine.chooseMaterial(cabinJSON.getString("material")));
    }
}
