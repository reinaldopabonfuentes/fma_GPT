package com.rpf.gpt.fma.repository;

import com.rpf.gpt.fma.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    // Additional custom query methods can be defined here if needed
}
