package com.company;

import com.company.person.PersonGenerator;
import org.json.JSONArray;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public static String personEndpoint(int size) {
        JSONArray finaljson = new JSONArray();
        for(int i=0; i<size; i++){
            finaljson.put(PersonGenerator.InstanceOfPerson());
        }
        return finaljson.toString();
    }
}
