package com.helpCo.MyNurse.controllers;

import com.helpCo.MyNurse.models.Roles.Nurse;
import com.helpCo.MyNurse.repositories.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/nurse")
public class NurseController {

    @Autowired
    private NurseRepository repository;

    @GetMapping
    public @ResponseBody List<Nurse> getNurses() {return repository.findAll();}

    @PostMapping
    public @ResponseBody Nurse createNurse(@RequestBody Nurse newNurse){
       return repository.save(newNurse);
    }

    @GetMapping("/{id}")
    public @ResponseBody Nurse getSingleNurse(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


}
