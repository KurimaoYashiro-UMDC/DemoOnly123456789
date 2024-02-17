/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Glehmon;

/**
 *
 * @author Administrator
 */
public class Palitaomalalag {
    
    public static void main(String[] args) {
        
        int[] array = {50, 100, 60, 8, 500};
        
        System.out.println("Elements of the array:");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        
        int sum =  array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println("Sum of all arrays: " + sum);
        
        int max = Math.max(array[0], Math.max(array[1], Math.max(array[2], Math.max(array[3], array[4]))));
        
        System.out.println("Maximum value: " + max);
    }
}
