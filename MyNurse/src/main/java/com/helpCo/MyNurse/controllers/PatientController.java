package com.helpCo.MyNurse.controllers;

import com.helpCo.MyNurse.models.Roles.Patient;
import com.helpCo.MyNurse.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @GetMapping
    public @ResponseBody
    List<Patient> getPatient() {return repository.findAll();}

    @PostMapping
    public @ResponseBody Patient createPatient(@RequestBody Patient newPatient){
        return repository.save(newPatient);
    }

    @GetMapping("/{id}")
    public @ResponseBody Patient getSinglePatient(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
