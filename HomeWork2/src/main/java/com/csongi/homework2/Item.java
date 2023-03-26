package com.csongi.homework2;

import java.util.ArrayList;

public class Item {
    private String name;
    private int price;
    private int saveMoney;
    private double percentage;
    private ArrayList<Item> items;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        saveMoney = 0;
        percentage = 0;
        items = new ArrayList<>();
        //items.add(this);
    }
    public Item() {
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int count = 0;
        for(Item item : items) {
            count++;
        }
        return count;
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
        int a = saveMoney / items.size();
        int b;
        for (int i = 0; i < items.size(); i++) {
            if(items.size() > 1) {
                System.out.println(items.get(i) + " nevezetű termékből levontunk " + a);
                b = items.get(i).price - a;
                if(b <= 0) {
                    b = 0;
                    int c = a - items.get(i).price;
                    System.out.println(c);
                    //money += c;
                }
                System.out.println("Így a termék új ára: " + b);
            } else {
                this.price -= saveMoney;
                System.out.println("A termékből levontunk " + saveMoney + " így az új ára: " + this.price);
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
    public int getRealPrice(int index) {
        if(index >= 0 && index < items.size()) {
            //savedMoney = 100
            int real = saveMoney / items.size(); // 100 / 2 = 50
            int a = getPrice(index) - real;
            return a;
        }
        //return price - saveMoney / items.size();
        return 0;
    }
    
//    public void clearItem(int index) {
//        if(percentage >= 100) {
//            items.remove(index);
//        }
//    }
    public void percentageSavings(int index) {
        double realPrice = getPrice(index);
        
        double b = saveMoney / realPrice;
        double c = b * 100;
        System.out.println("SavedMoney: " + saveMoney);
        System.out.println("Ennyi százalék: " + c + "%");
        percentage = c;
        
        if(percentage >= 100){
            System.out.println(items.get(index).name+" nevezetű terméket sikeresen megvette");
            items.remove(index);
        } else {
            
        }
    }
    
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", saveMoney=" + saveMoney + ", items=" + items + '}';
    }
    
}
