package com.developers.jpasecurity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.developers.jpasecurity.model.User;

public interface UserRepository extends CrudRepository<User,Long>{

	Optional<User> findByUsername(String username);
}
