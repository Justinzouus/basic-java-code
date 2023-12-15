package com.itheima.practice.test;

import com.itheima.practice.object.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product[] array = new Product[3];

        Product g1 = new Product("001","华为P40",5999,100);
        Product g2 = new Product("002","保温杯",227,50);
        Product g3 = new Product("003","枸杞",12.7,70);

        array[0] = g1;
        array[1] = g2;
        array[2] = g3;

        for (int i = 0; i < array.length; i++) {
            Product product = array[i];
            System.out.println(product.getId() + product.getName() + product.getPrice() + product.getInventory());
        }
    }
}
