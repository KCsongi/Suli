package com.csongi.homework;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Üdvözlöm. Kérjem írjon be egy kívánságot: ");
//        String wish = scanner.nextLine();
//        
//        System.out.println("Kérem írja be az árát: ");
//        int price = scanner.nextInt();
//        
//        WishList list = new WishList();
//        list.addItem(wish, price);
        
        WishList list2 = new WishList();
        list2.addItem("Szék", 300);
        list2.addItem("Asztal", 500);
        list2.addItem("Ház", 1000);
        
        System.out.println(list2.getSize());
        System.out.println(list2.addMoney(300));
        System.out.println(list2.getItemPrice(0));
        System.out.println("Az asztal ára: " + list2.getItemPrice(1));
        System.out.println("Total: " + list2.getTotal());
        
        System.out.println("RealPrice::: " + list2.getItemRealPrice(3));
        
        System.out.println("ÁR: " + list2.getItemPrice(1));
        System.out.println("ÁR: " + list2.getItemRealPrice(1));
        
        System.out.println("-".repeat(20));
        System.out.println(list2.getItemPrice(0));
        System.out.println(list2.getItemRealPrice(0));
        System.out.println(list2.getItemPrice(1));
        System.out.println(list2.getItemRealPrice(1));
        System.out.println(list2.getItemPrice(2));
        System.out.println(list2.getItemRealPrice(2));
        //System.out.println(list2.getItemPrice(0));
        
        //System.out.println(list2.getItemName(1));
        
        
        
    }
}
