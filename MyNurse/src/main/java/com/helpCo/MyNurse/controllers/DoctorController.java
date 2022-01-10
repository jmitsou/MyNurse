package com.helpCo.MyNurse.controllers;

import com.helpCo.MyNurse.models.Roles.Doctor;
import com.helpCo.MyNurse.models.Roles.Guardian;
import com.helpCo.MyNurse.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @GetMapping
    public @ResponseBody
    List<Doctor> getDoctor() {return repository.findAll();}

    @PostMapping
    public @ResponseBody Doctor createGuardian(@RequestBody Doctor newDoctor){
        return repository.save(newDoctor);
    }

    @GetMapping("/{id}")
    public @ResponseBody Doctor getSingleGuardian(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
