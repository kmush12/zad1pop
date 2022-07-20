package com.company.json;

import java.io.InputStream;

import org.json.*;

public class JsonFileReader {

    public  JSONObject tokenToObject(){
        return new JSONObject(dataToJSONToken());
    }

    private  JSONTokener dataToJSONToken() {
        return new JSONTokener(convertFileNameToInputStream());
    }

    private  InputStream convertFileNameToInputStream(){
        String fileName = "dane.json";
        InputStream inputStream = JsonFileReader.class.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new NullPointerException("Cannot find resource file " + fileName);
        }
        return inputStream;
    }
}
