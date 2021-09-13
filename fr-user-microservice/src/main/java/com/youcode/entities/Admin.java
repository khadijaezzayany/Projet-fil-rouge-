package com.youcode.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import ma.youcode.models.Role;
import ma.youcode.models.User;

@Entity
@PrimaryKeyJoinColumn(name = "id_user")
@Table(name = "admin")
public class Admin extends User {

	public Admin() {
		super();
	}

	public Admin(Long id, String firstName, String lastName, String email, String password, int phone, Role role) {
		super(id, firstName, lastName, email, password, phone, role);
		// TODO Auto-generated constructor stub
	}

	public Admin(String firstName, String lastName, String email, String password, int phone, Role role) {
		super(firstName, lastName, email, password, phone, role);
		// TODO Auto-generated constructor stub
	}

}