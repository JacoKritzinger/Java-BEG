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
public class Example6_24 {
  // Here, msg is a normal parameter and v is a  
  // varargs parameter.  
  static void vaTest(String msg, int ... v) {  
    System.out.println(msg + v.length);  
    System.out.println("Contents: ");  
  
    for(int i=0; i < v.length; i++)  
      System.out.println("  arg " + i + ": " + v[i]);  
  
    System.out.println();  
  }  
  
  public static void main(String args[])   
  {  
    vaTest("One vararg: ", 10);  
    vaTest("Three varargs: ", 1, 2, 3);   
    vaTest("No varargs: ");   
  }  
}
