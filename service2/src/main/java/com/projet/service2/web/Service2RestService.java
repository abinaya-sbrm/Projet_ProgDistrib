package com.projet.service2.web;

import com.projet.service2.data.Item;
import com.projet.service2.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Service2RestService {

	private final ItemService itemService;

	public Service2RestService(ItemService itemService) {
		this.itemService = itemService;
	}

	// Endpoint de test
	@GetMapping("/hello")
	public String hello() {
		return "Hello from service2";
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
