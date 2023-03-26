package com.csongi.homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        Item item = new Item();
        item.addNewItem("Szék", 500);
        item.addNewItem("Ház", 50000);
        item.addNewItem("Asztal", 8965);
        
        
        //item.addMoney(100);
        System.out.println(item.getPrice(0)); // 500
        System.out.println(item.getPrice(1)); // 50000
        System.out.println(item.getPrice(2)); // 300
        System.out.println(item.getPrice(3)); // 300
        
        System.out.println(item.getSize());
        
        System.out.println("-".repeat(20));
        item.addMoney(5000);
        System.out.println(item.getPrice(0));
        System.out.println("-".repeat(20));
        System.out.println(item.getRealPrice(0));
        System.out.println(item.getPrice(1));
        System.out.println(item.getRealPrice(1));
        
        item.percentageSavings(0);
        
        
        System.out.println(item.getSize());
    }
}
