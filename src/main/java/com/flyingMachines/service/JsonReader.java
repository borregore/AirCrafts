package com.flyingMachines.service;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public JSONArray readFromJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("json.json").getFile());
        Object obj = parser.parse(new FileReader(file));
        JSONArray jsonArray = (JSONArray) obj;
        return jsonArray;
    }
}
