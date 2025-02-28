package com.hmstatus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmstatus.entity.Item;
import com.hmstatus.service.ItemService;
@RestController
@RequestMapping("/api/items")
//@CrossOrigin(origins = "http://localhost:5173")	//Allow frontend to call //by create-vite
@CrossOrigin(origins = "http://localhost:3001")	//Allow frontend to call  //by create-react-app
public class ItemController {
	@Autowired
	private ItemService itemService;
	
//	@GetMapping
//	public String Itemworking() {
//		return "Item store is working";
//	}
	@GetMapping
	public List<Item> getItems() {
		return itemService.getAllItem();
	}
	
	@PostMapping()
	public Item addItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	
	public void deleteItem(@PathVariable Long id) {
		itemService.deleteItem(id);
	}
	

}
