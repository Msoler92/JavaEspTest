package org.example.npcs;

public class Peasant extends Vendor {
    public Peasant (String city, String name) {
        super(city, name);
        MAX_INVENTORY_SIZE = 5;
        TAX = 2;
        CONDITION_LOSS = 15;
    }
}
