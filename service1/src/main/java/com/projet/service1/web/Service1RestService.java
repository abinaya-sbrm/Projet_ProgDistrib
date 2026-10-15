package com.projet.service1.web;

import com.projet.service1.data.Item;
import com.projet.service1.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Service1RestService {

	private final ItemService itemService;

	public Service1RestService(ItemService itemService) {
		this.itemService = itemService;
	}

	// Endpoint de test
	@GetMapping("/hello")
	public String hello() {
		return "Hello from service1";
	}

	@GetMapping("/items")
	public List<Item> getItems() {
		return itemService.findAll();
	}

	@PostMapping("/items")
	public Item createItem(@RequestBody String name) {
		return itemService.create(name);
	}

}
