package com.example.myspring.myfirstspring.controller;

import com.example.myspring.myfirstspring.model.person;
import com.example.myspring.myfirstspring.repository.personRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class personController {

    @Autowired
    private personRepository repository;


    @RequestMapping(value="/person", method = RequestMethod.POST)
    public person save (@RequestBody person orang){
        return repository.save(orang);
    }

    @RequestMapping(value="/person/{id}", method = RequestMethod.GET)
    public person get(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(value="/person/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable Long id){
        repository.deleteById(id);
    }
}
