package com.hmstatus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmstatus.entity.Item;
import com.hmstatus.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItem(){
		return itemRepository.findAll();
	}
	
	public Item saveItem(Item item) {
		return itemRepository.save(item);
		
	}
	
	public void deleteItem(Long id) {
		itemRepository.deleteById(id);
	}

}
