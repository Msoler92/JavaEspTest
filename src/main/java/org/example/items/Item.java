package org.example.items;

public class Item {
    private String name;
    private String type;
    private double price;
    private int condition;

    public Item (String name, String type, double price, int condition) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.condition = condition;
    }

    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public boolean updateCondition(int conditionLoss){
        condition -= conditionLoss;
        if (condition < 0) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Price: " + price + "\n" +
                "Condition: " + condition + "\n";
    }
}
