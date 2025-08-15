package com.microservice.user.application.ports.out;

import com.microservice.user.domain.User;
import com.microservice.user.infrastructure.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.rmi.Remote;

public interface UserRepositoryPort{

    User save(User user);

}
