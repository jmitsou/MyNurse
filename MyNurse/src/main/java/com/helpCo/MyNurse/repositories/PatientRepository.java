package com.helpCo.MyNurse.repositories;

import com.helpCo.MyNurse.models.Roles.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository<Patient, Long> {
}
