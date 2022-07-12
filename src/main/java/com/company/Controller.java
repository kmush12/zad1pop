package com.company;


import org.json.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.company.PersonService.personEndpoint;

@RestController
@RequestMapping("/generate")
public class Controller {

    @GetMapping("/json/{size}")
    public static String endpoint(@PathVariable int size) {
        return personEndpoint(size);
    }
}
