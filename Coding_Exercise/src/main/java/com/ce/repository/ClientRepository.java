package com.ce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ce.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
   
	// Add custom query to search for Companies by employees range
    @Query("SELECT c FROM Client c WHERE c.company.employees BETWEEN :minEmployees AND :maxEmployees")
    List<Client> findClientsByEmployeeRange(int minEmployees, int maxEmployees);

    // Add custom query to search for Clients by company name
    List<Client> findByCompany_NameContaining(String companyName);

	List<Client> findCompaniesWithMaxRevenueInIndustry();
}
