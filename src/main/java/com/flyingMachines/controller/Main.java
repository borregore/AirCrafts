package com.flyingMachines.controller;

import com.flyingMachines.model.flyingArtifacts.FlyingMachine;
import com.flyingMachines.service.Classifier;
import com.flyingMachines.service.FlyinMachineFactory;
import com.flyingMachines.service.FlyingMachineEngine;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

public class Main {

    //http://www.json-generator.com/api/json/get/bUDKMdYhwy?indent=2
    public static void main(String[] args) throws JSONException {
        FlyinMachineFactory flyingMachineFactory = new FlyinMachineFactory();
        FlyingMachineEngine flyingMachineEngine = new FlyingMachineEngine();
        List<FlyingMachine> list = new LinkedList<FlyingMachine>();
        JSONArray json = new JSONArray();

        for(int i = 0; i < json.length(); i++) {
            JSONObject objects = (JSONObject) json.get(i);
            list.add(flyingMachineFactory.createFlyingMachine(flyingMachineEngine.chooseFlyingMachine(objects), objects));
        }

        Classifier.machineWithMaxWeight(list);

        Classifier.machineWithLowestWeight(list);

        Classifier.machineWithHighestFuelQuantity(list);

        Classifier.machineWithLowestFuelQuantity(list);

        Classifier.totalPrice(list);

        Classifier.airshipRank(list);

        Classifier.airshipName(list);

        Classifier.quantityByType(list);

        Classifier.quantityByFuelType(list);

        Classifier.quantityByWings(list);

        Classifier.quantityByRockets(list);

        Classifier.quantityByCabin(list);

        Classifier.quantitiyByPropellers(list);
    }
}
