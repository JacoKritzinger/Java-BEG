/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author Jaco
 */
public class Example3_15 {
  public static void main(String args[])   
    throws java.io.IOException { 
 
    int i; 
 
    System.out.println("Press S to stop."); 
 
    for(i = 0; (char) System.in.read() != 'S'; i++) 
      System.out.println("Pass #" + i); 
  }   
}