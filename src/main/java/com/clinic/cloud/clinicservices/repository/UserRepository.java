package com.clinic.cloud.clinicservices.repository;

import com.clinic.cloud.clinicservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
