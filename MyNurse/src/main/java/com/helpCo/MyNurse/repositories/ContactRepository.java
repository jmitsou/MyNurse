package com.helpCo.MyNurse.repositories;

import com.helpCo.MyNurse.models.EContactType;
import com.helpCo.MyNurse.models.Roles.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findAllByType(EContactType type);
}
