package io.java.springsecurityjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.java.springsecurityjpa.models.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	Optional<User> findByUserName(String userName);
}
