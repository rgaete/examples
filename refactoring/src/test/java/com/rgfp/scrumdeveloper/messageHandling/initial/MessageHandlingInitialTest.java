package com.rgfp.scrumdeveloper.messageHandling.initial;

import com.rgfp.scrumdeveloper.common.Inventory;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageHandlingInitialTest {

    private MessageHandlingInitial messageHandling;
    private Inventory inventoryWithItems = new Inventory(5);
    private Inventory inventoryWithoutItems = new Inventory(0);

    @Test
    public void shouldPrintWeHaveNoMoreItemsWhenItemsLeftIsZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithoutItems);

        String expectedMessage = "We have no more items.";

        assertEquals(expectedMessage, messageHandling.printStatus());

    }

    @Test
    public void shouldPrintWeHaveItemsWhenItemsLeftIsBiggerThanZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithItems);

        String expectedMessage = "We have 5 items.";

        assertEquals(expectedMessage, messageHandling.printStatus());

    }

    @Test
    public void shouldSendEmailWithItemsWhenItemsLeftIsBiggerThanZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithItems);

        String expectedMessage = "We have 5 items.";

        assertEquals(expectedMessage, messageHandling.sendEmailWithStatus());

    }

    @Test
    public void shouldSendEmailWithNoMoreItemsWhenItemsLeftIsZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithoutItems);

        String expectedMessage = "We have no more items.";

        assertEquals(expectedMessage, messageHandling.sendEmailWithStatus());

    }


}