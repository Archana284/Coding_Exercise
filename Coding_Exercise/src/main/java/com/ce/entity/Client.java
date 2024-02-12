package com.ce.entity;

import java.util.Date;


import jakarta.persistence.Entity;
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
@Entity
public class Client {

	private Long id;
    private String name;
    private User user;
    private Company company;
    private String email;
    private String phone;
}
