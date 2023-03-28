package com.csongi.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeWorkTest {
    
    public HomeWorkTest() {
    }
    
    

    @Test
    public void testMain() {
        WishList list = new WishList();
        list.addItem("Asztal", 500);
        list.addItem("Szék", 200);
        assertEquals(list.getItemName(1), "Szék", "getItemByName");
        assertEquals(list.getItemPrice(0), 500, "getItemPrice");
        assertEquals(list.getSize(), 2, "getSize");
        assertEquals(list.getTotal(), 700, "getTotal");
        assertEquals(list.getItemRealPrice(0), 500, "getItemRealPrice");
        
        WishList list2 = new WishList();
        list2.addItem("Pohár", 100);
        list2.addItem("Tányér", 200);
        assertEquals(list2.getItemPrice(0), 100);
        assertEquals(list2.getItemPrice(1), 200);
        assertEquals(list2.getTotal(), 300);
        list2.addMoney(100);
        assertEquals(list2.getItemRealPrice(0), 50);
        assertEquals(list2.getItemRealPrice(1), 150);
        assertEquals(list2.getTotal(), 200);
    }
    
}
