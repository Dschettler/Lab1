/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 0784219
 */
public class SalesTax1 {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance();
        {
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);
        }
        System.out.println("Please enter the purchase price");
        Scanner keyboard = new Scanner(System.in);
        double purchasePrice = keyboard.nextDouble();
        double stateSalesTax = .04 * purchasePrice;
        double countySalesTax = .02 * purchasePrice;
        double totalSalesTax = countySalesTax+stateSalesTax;
        double totalPrice = totalSalesTax+ purchasePrice;

        System.out.println("Purchase Price: $" + nf.format(purchasePrice));
        System.out.println("State Sales Tax: $" + nf.format(stateSalesTax));
        System.out.println("County Sales Tax: $" + nf.format(countySalesTax));
        System.out.println("Total Sales Tax: $" + nf.format(totalSalesTax));
        System.out.println("Total Price: $" + nf.format(totalPrice));

    }
}
