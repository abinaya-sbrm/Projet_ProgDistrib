package com.projet.service1.services;

import com.projet.service1.data.Item;

import java.util.List;

public interface ItemService {

	List<Item> findAll();

	Item create(String name);

}
