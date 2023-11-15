package org.example.npcs;

import org.example.exceptions.InventoryFullException;
import org.example.items.Item;
import org.example.utils.ItemManager;

import java.util.ArrayList;

public class Vendor {
    protected int MAX_INVENTORY_SIZE;
    protected int TAX;
    protected int CONDITION_LOSS;

    private String city;
    private String name;
    private ArrayList<Integer> inventory;

    public Vendor (String city, String name) {
        inventory = new ArrayList<>();
        this.city = city;
        this.name = name;
    }

    public ArrayList<Integer> getInventory() {
        return inventory;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int giveItem (int i) {
        int saleID = inventory.get(i);
        inventory.remove(i);
        return saleID;
    }
    public void addItem (int id) throws InventoryFullException {
        if (inventory.size() >= MAX_INVENTORY_SIZE) {
            throw new InventoryFullException("Inventory full! - Vendor cannot buy the item");
        }
        ItemManager.getInstance().getItem(id).updateCondition(CONDITION_LOSS);
        inventory.add(id);
    }

}
