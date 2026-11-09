package com.example.listening_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.listening_api.entity.User;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
