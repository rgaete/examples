package com.rgfp.scrumdeveloper.messageHandling.modified;

import com.rgfp.scrumdeveloper.common.Inventory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageHandlingModifiedTest {

    private MessageHandlingModified messageHandling;
    private Inventory inventoryWithItems = new Inventory(5);
    private Inventory inventoryWithoutItems = new Inventory(0);

    @Test
    public void shouldPrintWeHaveNoMoreItemsWhenItemsLeftIsZero() {

        messageHandling = new MessageHandlingModified(inventoryWithoutItems);

        String expectedMessage = "We have no more items.";

        assertEquals(expectedMessage, messageHandling.printStatus());

    }

    @Test
    public void shouldPrintWeHaveItemsWhenItemsLeftIsBiggerThanZero() {

        messageHandling = new MessageHandlingModified(inventoryWithItems);

        String expectedMessage = "We have 5 items.";

        assertEquals(expectedMessage, messageHandling.printStatus());

    }

    @Test
    public void shouldSendEmailWithItemsWhenItemsLeftIsBiggerThanZero() {

        messageHandling = new MessageHandlingModified(inventoryWithItems);

        String expectedMessage = "We have 5 items.";

        assertEquals(expectedMessage, messageHandling.sendEmailWithStatus());

    }

    @Test
    public void shouldSendEmailWithNoMoreItemsWhenItemsLeftIsZero() {

        messageHandling = new MessageHandlingModified(inventoryWithoutItems);

        String expectedMessage = "We have no more items.";

        assertEquals(expectedMessage, messageHandling.sendEmailWithStatus());

    }


}