package org.example.utils;

import org.example.items.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemManager {
    private int idCounter;
    private HashMap<Integer, Item> itemList;

    private static ItemManager instance;

    private ItemManager() {
        idCounter = 1;
        itemList = new HashMap<>();
        instance = this;
        addItem(new Item ("Sword", "Weapon", 15.0, 100));
    }

    public static ItemManager getInstance() {
        if (instance == null) {
            instance = new ItemManager();
        }
        return instance;
    }

    public Item getItem(int id) {
        return itemList.get(id);
    }

    public void updateItem(int id, Item item) {
        itemList.put(idCounter, item);
    }

    public void addItem(Item item) {
        itemList.put(idCounter, item);
        idCounter++;
    }

    public void removeItem(int id) {
        itemList.remove(id);
    }

    public ArrayList<Item> asList() {
        return new ArrayList<>(itemList.values());
    }

}
