package com.helpCo.MyNurse.controllers;

import com.helpCo.MyNurse.models.EContactType;
import com.helpCo.MyNurse.models.Roles.Contact;
import com.helpCo.MyNurse.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping
    public @ResponseBody
    List<Contact> getContact() {return repository.findAll();}

    @GetMapping("/{id}")
    public @ResponseBody Contact getSingleContact(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/type/{type}")
    public @ResponseBody List<Contact> getByType(@PathVariable EContactType type) {
        return repository.findAllByType(type);
    }

    @PostMapping("/nurse")
    public @ResponseBody Contact createNurse(@RequestBody Contact newContact){
        newContact.setType(EContactType.NURSE);
        return repository.save(newContact);
    }

    @PostMapping("/guardian")
    public @ResponseBody Contact createGuardian(@RequestBody Contact newContact){
        newContact.setType(EContactType.GUARDIAN);
        return repository.save(newContact);
    }



}
