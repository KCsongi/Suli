package com.csongi.homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        Item item = new Item("Asztal", 300);
        item.addNewItem("Szék", 500);
        item.addNewItem("Ház", 50000);
        
        System.out.println(item.getPrice(2));
        item.addMoney(100);
        
        
    }
}
