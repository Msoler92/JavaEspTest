package org.example;


import org.example.items.Item;
import org.example.npcs.Vendor;
import org.example.utils.ItemManager;

import java.util.ArrayList;
import java.util.Comparator;

import static org.example.utils.Keyboard.*;

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        ArrayList<Vendor> vendors = initializeVendors();
        ArrayList<Integer> pcInventory;

        while (run) {
            switch (mainMenu()) {
                case 1:
                    inspectCity(readString("Enter the name of the city you'd like to visit:"));
                    break;
                case 2:
                    showItemsByType(readString("Enter the type of item you'd like to list:"));
                    break;
                case 0:
                    run = false;
                    break;
            }
        }
    }
    static ArrayList<Vendor> initializeVendors() {

    }
    static int mainMenu() {
        System.out.println("1. Inspect a city.");
        System.out.println("2. List available items by type.");
        System.out.println("0. Exit application.");
        return readInt("Enter the number of the action you wish to execute:");
    }
    static int cityMenu() {
        System.out.println("1. List vendors in the city.");
        System.out.println("2. Show the cheapest item in the city.");
        System.out.println("3. Buy from vendor");
        System.out.println("4. Sell to vendor");
        System.out.println("0. Back.");
        return readInt("Enter the number of the action you wish to execute:");
    }

    static void inspectCity(String city) {
        ArrayList<Vendor> vendors;
        switch (cityMenu()) {
            case 1:
                vendors.stream().filter(v -> v.getCity().equals(city)).forEach(v -> System.out.println(v.getName()));
                break;
            case 2:
                ArrayList<Integer> itemsInCity = new ArrayList<>();
                vendors.stream().filter(v -> v.getCity().equals(city)).forEach(v -> itemsInCity.addAll(v.getInventory()));
                itemsInCity.stream().sorted(Comparator.comparingDouble(Item::getPrice)).forEach(System.out::println);
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
        }
    }

    static void showItemsByType(String type) {
        ItemManager.getInstance().asList().stream().
                filter(item -> item.getType().equals(type)).
                sorted(Comparator.comparingDouble(Item::getPrice)).
                forEach(System.out::println);

    }


}