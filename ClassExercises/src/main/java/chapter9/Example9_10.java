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
public class Example9_10 {
  public static void main(String args[]) { 
    try { 
      Rethrow.genException(); 
    } 
    catch(ArrayIndexOutOfBoundsException exc) { 
      // recatch exception 
     System.out.println("Fatal error -- " + 
                        "program terminated."); 
    } 
  } 
}