package com.company.Json;

import java.io.InputStream;

import org.json.*;

public class JsonFileReader {

    public static JSONObject tokenToObject(){
        return new JSONObject(dataToJSONToken());
    }

    private static JSONTokener dataToJSONToken() {
        return new JSONTokener(convertFileNameToInputStream());
    }

    private static InputStream convertFileNameToInputStream(){
        String fileName = "dane.json";
        InputStream inputStream = JsonFileReader.class.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new NullPointerException("Cannot find resource file " + fileName);
        }
        return inputStream;
    }
}
