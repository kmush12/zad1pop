package com.company.person;

import com.company.json.JsonFileReader;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Random;

public class PersonGenerator {


    public static Random rand = new Random();

    public JSONObject InstanceOfPerson() {
         int location_id = CountryInfoObject().getInt("location_id");
         boolean inEurope = CountryInfoObject().getBoolean("inEurope");
         String countryCode = CountryInfoObject().getString("countryCode");
         boolean coreCountry = CountryInfoObject().getBoolean("coreCountry");
         String distance = CountryInfoObject().getString("distance");
         Person person = new Person(getRandomNameAndConvertToString(), CountryName(), location_id, inEurope, countryCode, coreCountry, distance);
         return new JSONObject(person);
    }

    private String getRandomNameAndConvertToString() {
        int nameNumber = rand.nextInt(getAllNamesFromDataObject().length());
        JSONObject randomNameObject = getAllNamesFromDataObject().getJSONObject(nameNumber);
        return randomNameObject.get("name").toString();
    }

    private JSONObject CountryInfoObject() {
        return getRandomCountryObject().getJSONObject("info");
    }

    public String CountryName() {
        return getRandomCountryObject().getString("country");
    }


    private JSONObject getRandomCountryObject() {
        int countryNumber = rand.nextInt(getAllCountriesFromDataObject().length());
        return getAllCountriesFromDataObject().getJSONObject(countryNumber);
    }

    private JSONArray getAllNamesFromDataObject() {
        return jsonFileReader.tokenToObject().getJSONArray("names");
    }

    private JSONArray getAllCountriesFromDataObject() {
        return jsonFileReader.tokenToObject().getJSONArray("countries");
    }

    private final JsonFileReader jsonFileReader = new JsonFileReader();
}
