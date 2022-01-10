package com.helpCo.MyNurse.repositories;

import com.helpCo.MyNurse.models.Roles.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
