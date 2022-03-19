package com.masai.assignments.collection.problem2;

import java.util.Comparator;

public class ProductSortName implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {

        return p1.getProductName().compareTo(p2.getProductName());

    }
}
