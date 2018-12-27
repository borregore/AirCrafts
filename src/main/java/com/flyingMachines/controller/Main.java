package com.flyingMachines.controller;

import com.flyingMachines.model.flyingArtifacts.FlyingMachine;
import com.flyingMachines.service.Classifier;
import com.flyingMachines.service.FlyinMachineFactory;
import com.flyingMachines.service.FlyingMachineEngine;
import com.flyingMachines.service.JsonReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //http://www.json-generator.com/api/json/get/bUDKMdYhwy?indent=2
    public static void main(String[] args) throws IOException, ParseException {
        FlyinMachineFactory flyingMachineFactory = new FlyinMachineFactory();
        FlyingMachineEngine flyingMachineEngine = new FlyingMachineEngine();
        List<FlyingMachine> list = new ArrayList<>();

        JsonReader reader = new JsonReader();
        JSONArray json = reader.readFromJson();

        for(int i = 0; i < json.size(); i++) {
            JSONObject objects = (JSONObject) json.get(i);
            list.add(flyingMachineFactory.createFlyingMachine(flyingMachineEngine.chooseFlyingMachine(objects), objects));
        }

        //list.stream().forEach(x -> System.out.println(x.getCabin().getMaterial().getMaterialPrice()));

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
