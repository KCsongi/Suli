package com.csongi.homework;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Üdvözlöm. Kérjem írjon be egy kívánságot: ");
        String wish = scanner.nextLine();
        
        System.out.println("Kérem írja be az árát: ");
        int price = scanner.nextInt();
        
        WishList list = new WishList();
        list.addItem(wish, price);
        
        list.getItem();
    }
}
