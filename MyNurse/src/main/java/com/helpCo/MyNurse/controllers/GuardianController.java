package com.helpCo.MyNurse.controllers;

import com.helpCo.MyNurse.models.Roles.Guardian;
import com.helpCo.MyNurse.repositories.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/guardian")
public class GuardianController {

    @Autowired
    private GuardianRepository repository;

    @GetMapping
    public @ResponseBody
    List<Guardian> getGuardian() {return repository.findAll();}

    @PostMapping
    public @ResponseBody Guardian createGuardian(@RequestBody Guardian newGuardian){
        return repository.save(newGuardian);
    }

    @GetMapping("/{id}")
    public @ResponseBody Guardian getSingleGuardian(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
