/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Twice_Jihyo;
import java.util.Scanner;

/**
 *
 * @author Rhodz
 */
public class Activity3Rhodz {
    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       
       double celsius;
       double fahrenheit;
       
       System.out.print("Enter Celsius: ");
       celsius = scn.nextInt();
       
       fahrenheit = (celsius * 9/5) + 32;
       System.out.println("Celsius: " +celsius+"\n"+"Celsius to Fahrenheit: "+fahrenheit);
    }
}
