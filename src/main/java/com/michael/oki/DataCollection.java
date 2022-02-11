package com.michael.oki;
/*
* Given a string list in Java, find the first unique element without using a Set.
* */
import java.util.ArrayList;
import java.util.Arrays;

public class DataCollection {

    private static String output = null;

    public static String firstUniqueProduct(String[] products) {
        int productIndex = 0;

        ArrayList<String> rawData = new ArrayList<>();
        if (!Arrays.asList(products).isEmpty()) {
            for (String myProduct : products) {
                // Detect duplicate elements in the products ArrayList and find the first unique element
                if (rawData.contains(myProduct)) {
                    int index = Arrays.asList(products).indexOf(myProduct);
                    if (index == 0) {
                        productIndex++;
                    }
                    //Get the first unique element through using its index
                    output = Arrays.asList(products).get(productIndex);
                } else {
                    rawData.add(myProduct);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // N.B. You could replace this string list with a list of items returned from a database
        System.out.println(firstUniqueProduct(new String[]{"Apple", "Orange", "Computer", "Apple", "Bag"}));
    }

}

