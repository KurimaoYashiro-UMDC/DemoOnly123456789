/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Glehmon;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class java {
  
    public static void main(String [] args){
        
        Scanner s = new Scanner(System.in); 
            
        System.out.print("Math : ");
        float mathGrade = s.nextFloat();
        System.out.print("Science : ");
        float scienceGrade = s.nextFloat();
         System.out.print("English : ");
         float englishGrade = s.nextFloat();
         System.out.print("Computer : ");
         float computerGrade = s.nextFloat();
         
         float average = (mathGrade + scienceGrade + englishGrade + computerGrade)/4;
         
         System.out.println();
         System.out.println("Average : " + average);
         
         if(average > 100 )System.out.println("invalid");
         else if (average >= 98)System.out.println("With Highest Honors");
         else if (average >= 95)System.out.println("With High Honors");
         else if (average >= 90)System.out.println("With Honors");
         else if (average >= 75)System.out.println("Passed");
         else System.out.println("Failed");
         
    }
  
    
}
