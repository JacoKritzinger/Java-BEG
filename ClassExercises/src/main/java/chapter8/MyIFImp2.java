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

//8_23


public class MyIFImp2 implements MyIF { 
  // Here, implementations for both getUserID( ) and getAdminID( ) are 
  // provided. 
  public int getUserID() { 
    return 100; 
  } 
 
  public int getAdminID() { 
    return 42; 
  }   
}
