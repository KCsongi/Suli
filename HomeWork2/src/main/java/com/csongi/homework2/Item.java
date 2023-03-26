package com.csongi.homework2;

import java.util.ArrayList;

public class Item {
    private String name;
    private int price;
    private int saveMoney;
    private ArrayList<Item> items;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        saveMoney = 0;
        items = new ArrayList<>();
        //items.add(this);
    }

    public String getName() {
        return name;
    }

    public int getPrice(int index) {
        if(index >= 0 && index < items.size()) {
            return items.get(index).price;
        }
        return price;
    }

    public int getSaveMoney() {
        return saveMoney;
    }
    
    public void addMoney(int money) {
        this.saveMoney = money;
        int a = money / items.size();
        int b;
        for (int i = 0; i < items.size(); i++) {
            if(items.size() > 1) {
                System.out.println(items.get(i) + " nevezetű termékből levontunk " + a);
                b = items.get(i).price - a;
                System.out.println("Így a termék új ára: " + b);
            } else {
                this.price -= money;
                System.out.println("A termékből levontunk " + money + " így az új ára: " + this.price);
            }
            
        }
    }
    public void addNewItem(String name, int price) {
        Item item = new Item(name, price);
        items.add(item);
    }
    public void getItems() {
        for(Item item : items) {
            System.out.println("A temékek: " + item);
        }
    }
    public int getRealPrice() {
        
        return price - saveMoney;
    }
    
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", saveMoney=" + saveMoney + ", items=" + items + '}';
    }
    
}
