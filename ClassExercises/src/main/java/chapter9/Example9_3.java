/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Jaco
 */
public class Example9_3 {
  public static void main(String args[]) { 
    int nums[] = new int[4]; 
 
    System.out.println("Before exception is generated."); 
 
    // generate an index out-of-bounds exception 
    nums[7] = 10; 
  } 
}