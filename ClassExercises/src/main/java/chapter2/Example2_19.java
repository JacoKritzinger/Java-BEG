/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author Jaco
 */
public class Example2_19 {
  public static void main(String args[]) {    
    byte b; 
    int i; 
   
    b = 10; 
    i = b * b; // OK, no cast needed 
 
    b = 10; 
    b = (byte) (b * b); // cast needed!! 
 
    System.out.println("i and b: " + i + " " + b); 
  }    
}
