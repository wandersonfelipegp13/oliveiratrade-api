package com.oliveiratrade.signupsignin.repository;

import com.oliveiratrade.signupsignin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    /**
     *
     * @param username: User's username
     * @return Optional from User
     */
    Optional<User> findByUsername(String username);
}
