package com.lpu.hibernate;

import com.lpu.hibernate.entity.Product;
import com.lpu.hibernate.services.Operations;

public class App 
{
    public static void main( String[] args )
    {
        Product p1 = new Product(
                "Wireless Mouse",
                "Ergonomic wireless mouse with USB receiver",
                "Electronics",
                50,
                799.99,
                "ELEC-MOU-001",
                true
        );

        Product p2 = new Product(
                "Mechanical Keyboard",
                "RGB mechanical keyboard with blue switches",
                "Electronics",
                30,
                3499.00,
                "ELEC-KEY-002",
                true
        );

        Product p3 = new Product(
                "Laptop Backpack",
                "Water-resistant backpack for 15-inch laptops",
                "Accessories",
                40,
                1299.50,
                "ACC-BAG-003",
                true
        );

        Product p4 = new Product(
                "Bluetooth Headphones",
                "Over-ear noise cancelling headphones",
                "Electronics",
                25,
                5999.00,
                "ELEC-HEAD-004",
                true
        );

        Product p5 = new Product(
                "Smartphone Stand",
                "Adjustable aluminum mobile stand",
                "Accessories",
                100,
                299.00,
                "ACC-STD-005",
                true
        );

        Operations op = new Operations();

        op.insertData(p1);
        op.insertData(p2);
        op.insertData(p3);
        op.insertData(p4);
        op.insertData(p5);

        System.out.println(op.getProduct(1));


        op.updateProductPrice(2,689.90);

        op.deleteProduct(3);

    }
}
