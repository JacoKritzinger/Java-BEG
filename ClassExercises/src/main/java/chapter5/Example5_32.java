/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author Jaco
 */
public class Example5_32 {
  public static void main(String args[]) { 
    int val = 1; 
 
    for(int i = 0; i < 8; i++) {  
      for(int t=128; t > 0; t = t/2) { 
        if((val & t) != 0) System.out.print("1 ");  
        else System.out.print("0 ");  
      } 
      System.out.println(); 
      val = val << 1; // left shift 
    } 
    System.out.println(); 
 
    val = 128; 
    for(int i = 0; i < 8; i++) {  
      for(int t=128; t > 0; t = t/2) { 
        if((val & t) != 0) System.out.print("1 ");  
        else System.out.print("0 ");  
      } 
      System.out.println(); 
      val = val >> 1; // right shift 
    } 
  } 
}
