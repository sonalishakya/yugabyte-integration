package com.ondc.yugabyte_integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public Item getItemById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}
