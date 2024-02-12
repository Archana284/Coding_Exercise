package com.ce.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ce.entity.Client;
import com.ce.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping
	public ResponseEntity<Client> createClient(@RequestBody Client newClient) {
		Client createdClient = clientService.createClient(newClient);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdClient);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
		Client client = clientService.updateClient(id, updatedClient);
		if (client != null) {
			return ResponseEntity.ok(client);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
