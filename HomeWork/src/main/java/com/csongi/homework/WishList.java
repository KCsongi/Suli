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
    public int getSize() {
        return items.size();
    }
    public int addMoney(int money) {
        int a = money / items.size();
        int b;
        for (int i = 0; i < items.size(); i++) {
            if(items.size() > 1) {
                System.out.println(items.get(i) + " nevezetű termékből levontunk: " + a);
                b = getItemPrice(i) - a;
                System.out.println("Így a " + items.get(i) + " új ára: " + b);
            } else {
            a = items.get(i).getPrice() - a;
            System.out.println("A termék: " + items.get(i) + " a levont összeg: " + money);
            return a;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "WishList{" + "items=" + items + '}';
    }
    
}
