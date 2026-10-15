package com.projet.service2.services;

import com.projet.service2.data.Item;

import java.util.List;

public interface ItemService {

	List<Item> findAll();

	Item create(String name);

}
