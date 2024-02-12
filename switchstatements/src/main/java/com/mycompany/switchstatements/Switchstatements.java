/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchstatements;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Switchstatements {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of the fruits");
              break;  
            case "grape":
                System.out.println("Small fruit");
               break; 
            case "watermelon":
                System.out.println("Big fruit");
            break;
            
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}
