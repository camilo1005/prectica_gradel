package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" Usuario")
public class Usuario {
	@Id
	private Long id;
	

}
