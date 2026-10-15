package com.projet.service2.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Entité exemple : à renommer selon le sujet (Car, User, Order…)
@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public Item() {
	}

	public Item(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
