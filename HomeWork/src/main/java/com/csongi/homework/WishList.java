package com.csongi.homework;

import java.util.ArrayList;
import java.util.Objects;

public class WishList{
   
    private ArrayList<Item> items;
    private int savedMoney;
    private double percentage;


    public WishList() {
        this.items = new ArrayList<>();
        savedMoney = 0;
        percentage = 0;
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
    
    public Item getItemByName(String name) {
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getName().equalsIgnoreCase(name)) {
                return items.get(i);
            }
            
        }
        return null;
    }
    
    public int getItemPrice(int index) {
        if(index >= 0 && index < items.size()) {
            
            return items.get(index).getPrice();
        }
        
        return 0;
    }
    
    public int getItemRealPrice(int index) {
        if(index >= 0 && index < items.size()) {
            int real = savedMoney / items.size();
            int a = items.get(index).getPrice() - real;
            return a;
            //return items.get(index).getPrice() - addMoney(index);
        }
        
        return 0;
    }
    
    public void percentageSavings(int index) {
        double realPrice = items.get(index).getPrice();
        
        double b = savedMoney / realPrice;
        double d = b / items.size();
        double c = d * 100;
        System.out.println(items.get(index).getName()+" nevezetű termékből " + c + "% teljesítve");
        percentage = c;
        
        if(percentage >= 100){
            System.out.println(items.get(index).getName()+" nevezetű terméket sikeresen megvette");
            items.remove(index);
        }
    }
    
    public void clear() {
        items.clear();
    }
    
    public int getSize() {
        return items.size();
    }
    
    public int addMoney(int money) {
        savedMoney = money;
        int a = money / items.size();
        int b;
        for (int i = 0; i < items.size(); i++) {
            if(items.size() > 1) {
                System.out.println(items.get(i) + " nevezetű termékből levontunk: " + a);
                b = getItemPrice(i) - a;
                System.out.println("Így a " + items.get(i) + " új ára: " + b);
                return b;
            } else {
            a = items.get(i).getPrice() - a;
            System.out.println("A termék: " + items.get(i) + " a levont összeg: " + money);
            //return a;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        return "WishList{" + "items=" + items + ", savedMoney=" + savedMoney + ", percentage=" + percentage + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.items);
        hash = 79 * hash + this.savedMoney;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.percentage) ^ (Double.doubleToLongBits(this.percentage) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WishList other = (WishList) obj;
        if (this.savedMoney != other.savedMoney) {
            return false;
        }
        if (Double.doubleToLongBits(this.percentage) != Double.doubleToLongBits(other.percentage)) {
            return false;
        }
        return Objects.equals(this.items, other.items);
    }
    
    
}
