package com.flyingMachines.controller;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Main {

    //http://www.json-generator.com/api/json/get/bUDKMdYhwy?indent=2
    public static void main(String[] args) throws JSONException {
        JSONArray json = new JSONArray();
        for(int i = 0; i < json.length(); i++) {
            JSONObject objects = (JSONObject) json.get(i);
        }
    }

}
