package com.csongi.homework;

import java.util.ArrayList;

public class WishList {
   
    ArrayList<Item> items;
    
    public void addItem(String name, int price) {
        Item item = new Item(name, price);
        items.add(item);
    }
    public void getItem() {
        for(Item item : items) {
            System.out.println("A kosárba lévő termékek: " + item);
        }
    }
}
