package com.company.person;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Random;

import static com.company.json.JsonFileReader.tokenToObject;


public class PersonGenerator {


    public static Random rand = new Random();

    public static JSONObject InstanceOfPerson() {
         int location_id = CountryInfoObject().getInt("location_id");
         boolean inEurope = CountryInfoObject().getBoolean("inEurope");
         String countryCode = CountryInfoObject().getString("countryCode");
         boolean coreCountry = CountryInfoObject().getBoolean("coreCountry");
         String distance = CountryInfoObject().getString("distance");
         Person person = new Person(getRandomNameAndConvertToString(), CountryName(), location_id, inEurope, countryCode, coreCountry, distance);
         return new JSONObject(person);
    }

    public static String getRandomNameAndConvertToString() {
        int nameNumber = rand.nextInt(getAllNamesFromDataObject().length());
        JSONObject randomNameObject = getAllNamesFromDataObject().getJSONObject(nameNumber);
        return randomNameObject.get("name").toString();
    }

    private static JSONObject CountryInfoObject() {
        return getRandomCountryObject().getJSONObject("info");
    }

    public static String CountryName() {
        return getRandomCountryObject().getString("country");
    }


    private static JSONObject getRandomCountryObject() {
        int countryNumber = rand.nextInt(getAllCountriesFromDataObject().length());
        return getAllCountriesFromDataObject().getJSONObject(countryNumber);
    }

    public static JSONArray getAllNamesFromDataObject() {
        return tokenToObject().getJSONArray("names");
    }

    public static JSONArray getAllCountriesFromDataObject() {
        return tokenToObject().getJSONArray("countries");
    }

}
