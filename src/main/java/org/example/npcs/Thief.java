package org.example.npcs;

public class Thief extends Vendor {
    public Thief (String city, String name) {
        super(city, name);
        MAX_INVENTORY_SIZE = 3;
        TAX = 0;
        CONDITION_LOSS = 25;
    }
}
