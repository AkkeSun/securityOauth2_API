package com.example.securityoauth2_api.repo;

import com.example.securityoauth2_api.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
