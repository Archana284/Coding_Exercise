package com.ce.DTO;

import com.ce.entity.Company;
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
public class ClientDTO {

	private Long id;
    private String name;
    private User user;
    private Company company;
    private String email;
    private String phone;
}
