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
    }
    
}
