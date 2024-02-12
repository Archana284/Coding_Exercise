package com.ce.DTO;

import java.util.Date;

import com.ce.entity.Client;
import com.ce.entity.ClientUser;
import com.ce.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClientUserDTO {

	private Long id;
	private Client client;
	private User user;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private boolean active;
}
