package org.example.npcs;

public class Merchant extends Vendor {
    public Merchant (String city, String name) {
        super(city, name);
        MAX_INVENTORY_SIZE = 7;
        TAX = 4;
        CONDITION_LOSS = 0;
    }
}
