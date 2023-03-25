package com.csongi.homework;

import java.util.ArrayList;

public class WishList{
   
    ArrayList<Item> items;


    public WishList() {
        this.items = new ArrayList<>();
    }
    
    
    public void addItem(String name, int price) {
        Item item = new Item(name, price);
        items.add(item);
    }
//    public String getItem() {
//        if(!items.isEmpty()) {
//        for(Item item : items) {
//            //System.out.println("A kosárba lévő termékek: " + item.getName() + " az ára: " + item.getPrice());
//            return item.getName() + " " + item.getPrice();
//         }
//        }
//        return "Üres";
//    }
    public int getTotal() {
        int total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public String getItemName(int index) {
        if(index >= 0 && index < items.size()) {
            return items.get(index).getName();
        }
        return null;
    }
    public int getItemPrice(int index) {
        if(index >= 0 && index < items.size()) {
            return items.get(index).getPrice();
        }
        
        return 0;
    }
    public void clear() {
        items.clear();
    }
    
}
