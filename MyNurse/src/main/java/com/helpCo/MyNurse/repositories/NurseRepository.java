package com.helpCo.MyNurse.repositories;

import com.helpCo.MyNurse.models.Roles.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NurseRepository extends JpaRepository<Nurse, Long> {

    //Optional<Nurse> findByNid(Long nid);

    //List<Nurse> findAllByPatient_id();
}
