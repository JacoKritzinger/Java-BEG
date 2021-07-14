/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author Jaco
 */
public class Example6_20 {
  public static void main(String args[]) { 
    char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' }; 
    int i; 
 
    System.out.print("Original array: "); 
    for(i=0; i < a.length; i++)  
      System.out.print(a[i]); 
 
    System.out.println(); 
 
    // now, sort the array 
    Quicksort.qsort(a); 
     
    System.out.print("Sorted array: "); 
    for(i=0; i < a.length; i++)  
      System.out.print(a[i]); 
  } 
}
