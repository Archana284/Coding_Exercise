package com.ce.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class ClientUser {

	private Long id;
    private Client client;
    private User user;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private boolean active;
}
