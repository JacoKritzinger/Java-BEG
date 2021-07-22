/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Jaco
 */
public class Example8_18 implements IConst { 
  public static void main(String args[]) { 
    int nums[] = new int[MAX]; 
 
    for(int i=MIN; i < 11; i++) { 
      if(i >= MAX) System.out.println(ERRORMSG); 
      else { 
        nums[i] = i; 
        System.out.print(nums[i] + " "); 
      } 
    } 
  } 
}  
