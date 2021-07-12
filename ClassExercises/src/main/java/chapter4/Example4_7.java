/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author Jaco
 */
public class Example4_7 {
  public static void main(String args[]) {    
    Factor x = new Factor(); 
 
    if(x.isFactor(2, 20)) System.out.println("2 is factor"); 
    if(x.isFactor(3, 20)) System.out.println("this won't be displayed"); 
 
  } 
}
