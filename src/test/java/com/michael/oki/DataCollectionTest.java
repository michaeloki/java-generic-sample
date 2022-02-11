package com.michael.oki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DataCollectionTest {


    String[] products = new String[]{"Apple", "Orange", "Computer", "Apple", "Bag"};


    @Test
    void firstUniqueProduct() {
        Assertions.assertEquals("Orange", DataCollection.firstUniqueProduct(products));
    }

    @Test
    void main() {
        Assertions.assertNotNull(DataCollection.firstUniqueProduct(products));
    }
}