package com.ce.DTO;

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
public class UserDTO {

	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
}
