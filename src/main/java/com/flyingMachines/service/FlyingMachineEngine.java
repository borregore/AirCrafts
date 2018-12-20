package com.flyingMachines.service;

import com.flyingMachines.model.parts.Propeller;
import com.flyingMachines.model.parts.Rocket;
import com.flyingMachines.model.parts.Wings;
import com.flyingMachines.type.FlyingMachineType;
import com.flyingMachines.type.Fuel;
import com.flyingMachines.type.Material;
import com.flyingMachines.type.Purpose;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

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

    public FlyingMachineType chooseFlyingMachine(JSONObject json) throws JSONException {
        switch (json.getString("airshipType")) {
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

    public Purpose choosePurpose(JSONObject json) throws JSONException {
        switch (json.getString("purpose")) {
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

    public Fuel getFuelTypeFromJSON(JSONObject json) throws JSONException{
        switch (json.getString("fuelType")) {
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

    public Propeller[] getPropellersFromJSON(JSONObject json) throws JSONException{
        JSONArray propellers = json.getJSONArray("propellers");
        Propeller[] array = new Propeller[propellers.length()];
        for(int i = 0; i < propellers.length(); i++){
            JSONObject object = (JSONObject)propellers.get(i);
            String material = (String) object.get("material");
            array[i] = new Propeller(chooseMaterial(material));
        }
        return array;
    }

    public Wings[] getWingsFromJSON(JSONObject json) throws JSONException{
        JSONArray wings = json.getJSONArray("wings");
        Wings[] array = new Wings[wings.length()];
        for(int i = 0; i < wings.length(); i++){
            JSONObject object = (JSONObject)wings.get(i);
            String material = object.getString("material");
            array[i] = new Wings(chooseMaterial(material));
        }
        return array;
    }

    public Rocket[] getRocketsFromJSON(JSONObject json) throws JSONException{
        JSONArray rockets = json.getJSONArray("rockets");
        Rocket[] array = new Rocket[rockets.length()];
        for(int i = 0; i < rockets.length(); i++){
            JSONObject object = (JSONObject)rockets.get(i);
            String material = object.getString("material");
            array[i] = new Rocket(chooseMaterial(material));
        }
        return array;
    }

}
