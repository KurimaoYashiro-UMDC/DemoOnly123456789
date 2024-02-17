package Glehmon;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class anitamaxwyn {
    
    public static void main (String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        double celsius;
        double fahrenheit; 
        
        System.out.println("Enter Celsius: ");
        celsius = scn.nextInt();
        fahrenheit = (celsius*9/5) + 32;
        
        System.out.println("Celsius: " + celsius + "\n" + "celsius to fahrenheit: " + fahrenheit);
            
    }
}
