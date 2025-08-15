package com.microservice.user.infrastructure.adapters.out.persistence;

import com.microservice.user.infrastructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, Long> {



}
