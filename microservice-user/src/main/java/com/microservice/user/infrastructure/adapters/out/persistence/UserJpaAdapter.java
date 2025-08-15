package com.microservice.user.infrastructure.adapters.out.persistence;

import com.microservice.user.application.ports.out.UserRepositoryPort;
import com.microservice.user.domain.User;

public class UserJpaAdapter implements UserRepositoryPort {

    private final UserRepositoryJpa userRepositoryJpa;

    public UserJpaAdapter(UserRepositoryJpa userRepositoryJpa) {
        this.userRepositoryJpa = userRepositoryJpa;
    }

    @Override
    public User save(User user) {

        
        userRepositoryJpa.save(userEntity);

        return null;
    }
}
