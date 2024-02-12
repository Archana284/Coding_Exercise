package com.ce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ce.entity.Client;
import com.ce.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByUsernameContaining(String username);

    // Add custom query to retrieve all Clients a User belongs to
    @Query("SELECT c FROM Client c WHERE c.user.id = :userId")
    List<Client> findClientsByUserId(Long userId);
}
