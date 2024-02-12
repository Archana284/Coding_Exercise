package com.ce.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ce.entity.Client;
import com.ce.repository.ClientRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClientService {

	@Autowired
    private ClientRepository clientRepository;
	
	public List<Client> findCompaniesWithMaxRevenueInIndustry() {
        return clientRepository.findCompaniesWithMaxRevenueInIndustry();
    }
	
    private Map<Long, Client> clients = new HashMap<>();
    private Long nextClientId = 1L;

    public Client createClient(Client newClient) {
        newClient.setId(nextClientId++);
        clients.put(newClient.getId(), newClient);
        return newClient;
    }

    public Client updateClient(Long id, Client updatedClient) {
        if (clients.containsKey(id)) {
            updatedClient.setId(id);
            clients.put(id, updatedClient);
            return updatedClient;
        } else {
            return null; 
        }
    }
}