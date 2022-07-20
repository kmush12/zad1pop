package com.company;

import com.company.person.PersonGenerator;
import org.json.JSONArray;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String personEndpoint(int size) {
        JSONArray finalJson = new JSONArray();
        PersonGenerator person = new PersonGenerator();
        for(int i=0; i<size; i++){
            finalJson.put(person.InstanceOfPerson());
        }
        return finalJson.toString();
    }
}
