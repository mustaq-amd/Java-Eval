package com.masai.assignments.collection.problem2;

import java.util.Comparator;

public class ProductSortId implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getProductId()>p2.getProductId()){
            return 1;
        }
        else{
            return -1;
        }

    }
}
