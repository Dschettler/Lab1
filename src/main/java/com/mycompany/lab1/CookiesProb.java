
package com.mycompany.lab1;

import java.util.Scanner;
/**
 *
 * @author 0784219
 */
public class CookiesProb {
    public static void main(String[] args) {
        int caloriesPerCookie = 3000/40;
        Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter number of cookies eaten");
       int cookiesEaten = keyboard.nextInt();
       int totalCaloriesEaten = cookiesEaten * caloriesPerCookie;
       System.out.println("The number of cookies eaten was "+cookiesEaten +".");
       System.out.println("The total number of calories consumed was " + 
               totalCaloriesEaten + ".");
    }
}
