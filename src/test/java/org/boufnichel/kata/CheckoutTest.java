
package org.boufnichel.kata;

import org.boufnichel.kata.model.Bag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {

    @Test
    @DisplayName("Init bag")
    void test_simple_item() {
        Bag bag = new Bag("Nutella::88#Milka::20");
        assertEquals(2, bag.size());
        assertEquals(108, bag.calculate());
    }

    @Test
    @DisplayName("Quantity")
    void test_simple_item_quantity() {
        Bag bag = new Bag("Nutella:2:88#Milka:1:20");
        assertEquals(2, bag.size());
        assertEquals(196, bag.calculate());
    }

    @Test
    @DisplayName("Remove entry")
    void test_remove_entry() {
        Bag bag = new Bag("Nutella:2:88#Milka:1:20");
        assertEquals(2, bag.size());
        assertEquals(196, bag.calculate());

        bag.remove("Nutella");

        assertEquals(1, bag.size());
        assertEquals(20, bag.calculate());

    }

}
