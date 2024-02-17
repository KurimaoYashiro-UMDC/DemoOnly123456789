/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Glehmon;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PandaSaChina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
        System.out.println("Enter Last Name: ");
        String lName = scn.nextLine();
        
        System.out.println("Enter First Name: ");
        String fName = scn.nextLine();
        
        System.out.println("Enter Middle Name: ");
        String mName = scn.nextLine();
        
        System.out.println("Enter Age: ");
        int age = scn.nextInt();
                        scn.nextLine();
        System.out.println("Enter Gender: ");
        String gender = scn.nextLine();
        
        System.out.println("Enter Birthday: ");
        int birthday = scn.nextInt();
        
        System.out.println("Enter Birth Month: ");
        int birthmonth = scn.nextInt();
        
        System.out.println("Enter Birth Year: ");
        int birthyear = scn.nextInt();
        
        System.out.println("Your Data: ");
        
        System.out.println("Last Name: " + lName + "\n" + "First Name: " + fName + 
                "\n" + "Middle Name: " + mName + "\n" + "Age: " + age + "\n" + "Gender: " + 
                gender + "\n" + "Bithday: " + birthday + "/" + birthmonth + "/" + birthyear);
        scn.close();
        
        
        
        
        
    }
    
}
