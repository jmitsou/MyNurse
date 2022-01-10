package com.helpCo.MyNurse.repositories;

import com.helpCo.MyNurse.models.Roles.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuardianRepository extends JpaRepository<Guardian, Long> {
}
