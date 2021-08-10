package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product product[] = new Product[5];

        Scanner input = new Scanner(System.in);
        // product details
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter product details "+(i+1));
            product[i] = new Product();
            product[i].acceptProduct();
        }
        //Sort product by realPrice
        Product temp;
        for(int i = 0; i < product.length - 1;i++) {
            for(int j = i + 1; j < product.length; j++) {
                if(product[i].getRealPrice() > product[j].getRealPrice()) {
                    temp = product[i];
                    product[i] = product[j];
                    product[j] = temp;
                }
            }
        }
        //Display details sorted
        System.out.println("List all product sorted by realprice:");
        for(int i = 0; i < product.length; i++) {
            System.out.println("\nProduct "+(i+1)+"==\n");
            product[i].print();
            System.out.println("Real price: "+product[i].getRealPrice());
        }
        input.close();
    }
}

