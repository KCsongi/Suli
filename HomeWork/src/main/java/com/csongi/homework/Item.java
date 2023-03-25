package com.csongi.homework;

public class Item {
    private String name;
    private int price;
    public int savedMoney;

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
    public void addMoneyy(int money) {
         savedMoney -= money;
     }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", savedMoney=" + savedMoney + '}';
    }
    
}
