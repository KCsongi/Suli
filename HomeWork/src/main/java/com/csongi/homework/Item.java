package com.csongi.homework;

public class Item {
    private String name;
    private int price;
    private int savedMoney;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        savedMoney = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void addMoney(int money) {
         savedMoney += money;
     }

    
    
}
