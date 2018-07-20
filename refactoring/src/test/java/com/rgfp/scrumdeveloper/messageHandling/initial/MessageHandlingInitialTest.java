package com.rgfp.scrumdeveloper.messageHandling.initial;

import com.rgfp.scrumdeveloper.common.Inventory;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageHandlingInitialTest {

    private MessageHandlingInitial messageHandling;
    private Inventory inventoryWithItems = new Inventory(5);
    private Inventory inventoryWithoutItems = new Inventory(0);
    private static final String NO_MORE_ITEMS = "We have no more items.";
    private static final String WE_HAVE_5_ITEMS = "We have 5 items.";

    @Test
    public void shouldPrintWeHaveNoMoreItemsWhenItemsLeftIsZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithoutItems);

        assertEquals("Status: " + NO_MORE_ITEMS, messageHandling.printStatus());

    }

    @Test
    public void shouldPrintWeHaveItemsWhenItemsLeftIsBiggerThanZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithItems);

        assertEquals("Status: " + WE_HAVE_5_ITEMS, messageHandling.printStatus());

    }

    @Test
    public void shouldSendEmailWithItemsWhenItemsLeftIsBiggerThanZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithItems);

        assertEquals("[POP]Email sent with message " + WE_HAVE_5_ITEMS, messageHandling.sendEmailWithStatus());

    }

    @Test
    public void shouldSendEmailWithNoMoreItemsWhenItemsLeftIsZero() {

        messageHandling = new MessageHandlingInitial(inventoryWithoutItems);

        assertEquals("[POP]Email sent with message " + NO_MORE_ITEMS, messageHandling.sendEmailWithStatus());

    }


}