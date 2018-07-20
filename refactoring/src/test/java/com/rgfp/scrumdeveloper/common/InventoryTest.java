package com.rgfp.scrumdeveloper.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {

    @Test
    public void shouldReturnItemsLeft() {

        int inventorySize = 5;
        Inventory inventory = new Inventory(inventorySize);

        assertEquals(inventorySize, inventory.itemsLeft());

    }

}