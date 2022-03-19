package com.example.springbeanprop.controller;

import com.example.springbeanprop.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired(required = false)
    @Qualifier("cricket")
    Person cricket;

    @Autowired(required = false)
    @Qualifier("tennis")
    Person tennis;


    @GetMapping("/person/sport/{sport}")
    public ResponseEntity<Person> getPerson(@PathVariable
                                            String sport){
        if(sport!= null){
            if(null!= tennis && sport.equalsIgnoreCase("tennis")){
                return ResponseEntity.ok(tennis);
            } else if(null!= cricket && sport.equalsIgnoreCase("cricket")){
                return ResponseEntity.ok(cricket);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
