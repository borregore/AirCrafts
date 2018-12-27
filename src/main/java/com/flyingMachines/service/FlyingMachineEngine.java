package com.flyingMachines.service;

import com.flyingMachines.model.parts.Cabin;
import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wing;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Material;
import com.flyingMachines.type.Purpose;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FlyingMachineEngine {

    private static final String JET = "JET";
    private static final String SPACE_ROCKET = "SPACE_ROCKET";
    private static final String DRONE = "DRONE";
    private static final String HELICOPTER = "HELICOPTER";
    private static final String AIRPLANE = "AIRPLANE";
    private static final String MILITARY = "MILITARY";
    private static final String COMMERCIAL = "COMMERCIAL";
    private static final String PHOTOGRAPHY = "PHOTOGRAPHY";
    private static final String PLASTIC = "PLASTIC";
    private static final String STEEL = "STEEL";
    private static final String TITANIUM = "TITANIUM";
    private static final String WOOD = "WOOD";
    private static final String BATTERY = "BATTERY";
    private static final String DIESEL = "DIESEL";
    private static final String GASOLINE = "GASOLINE";
    private static final String AIR_FUEL = "AIR_FUEL";
    private static final String WATER = "WATER";

    public FlyingMachineType chooseFlyingMachine(JSONObject json) {
        switch (json.get("airshipType").toString()) {
            case JET:
                return FlyingMachineType.JET;
            case SPACE_ROCKET:
                return FlyingMachineType.SPACE_ROCKET;
            case DRONE:
                return FlyingMachineType.DRONE;
            case HELICOPTER:
                return FlyingMachineType.HELICOPTER;
            case AIRPLANE:
                return FlyingMachineType.AIRPLANE;
            default:
                return null;
        }
    }

    public Purpose choosePurpose(JSONObject json) {
        switch (json.get("categoryType").toString()) {
            case MILITARY:
                return Purpose.MILITARY;
            case COMMERCIAL:
                return Purpose.COMMERCIAL;
            case PHOTOGRAPHY:
                return Purpose.PHOTOGRAPHY;
            default:
                return null;
        }
    }

    public Material chooseMaterial(String material) {
        switch (material) {
            case PLASTIC:
                return Material.PLASTIC;
            case STEEL:
                return Material.STEEL;
            case TITANIUM:
                return Material.TITANIUM;
            case WOOD:
                return Material.WOOD;
            default:
                return null;
        }
    }

    public Fuel getFuelTypeFromJSON(JSONObject json) {
        switch (json.get("fuelType").toString()) {
            case BATTERY:
                return Fuel.BATTERY;
            case DIESEL:
                return Fuel.DIESEL;
            case GASOLINE:
                return Fuel.GASOLINE;
            case AIR_FUEL:
                return Fuel.AIR_FUEL;
            case WATER:
                return Fuel.WATER;
            default:
                return null;
        }
    }

    public List<Propeller> getPropellersFromJSON(JSONObject json) {
        JSONArray propellers = (JSONArray) json.get("propellers");
        List<Propeller> propellerList = new ArrayList<>();

        for (int i = 0; i < propellers.size(); i++) {
            JSONObject object = (JSONObject) propellers.get(i);
            String material = object.get("materialType").toString();
            propellerList.add(new Propeller(chooseMaterial(material)));
        }

        return propellerList;
    }

    public List<Wing> getWingsFromJSON(JSONObject json) {
        JSONArray wings = (JSONArray) json.get("wings");
        List<Wing> wingList = new ArrayList<>();

        for (int i = 0; i < wings.size(); i++) {
            JSONObject object = (JSONObject) wings.get(i);
            String material = object.get("materialType").toString();
            wingList.add(new Wing(chooseMaterial(material)));
        }

        return wingList;
    }

    public List<Rocket> getRocketsFromJSON(JSONObject json) {
        JSONArray rockets = (JSONArray) json.get("rockets");
        List<Rocket> rocketList = new ArrayList<>();

        for (int i = 0; i < rockets.size(); i++) {
            JSONObject object = (JSONObject) rockets.get(i);
            //System.out.println(object.get("materialType"));
            String material = object.get("materialType").toString();
            rocketList.add(new Rocket(chooseMaterial(material)));
        }

        return rocketList;
    }

    public Cabin createCabin(JSONObject inputValues) {
        JSONObject cabinJSON = (JSONObject) inputValues.get("cabin");
        return new Cabin(chooseMaterial(cabinJSON.get("materialType").toString()));
    }

}
