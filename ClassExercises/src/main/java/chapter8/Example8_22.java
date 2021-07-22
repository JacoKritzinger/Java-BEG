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
public class Example8_22 {
  public static void main(String args[]) { 
 
    MyIFImp obj = new MyIFImp(); 
 
    // Can call getUserID(), because it is explicitly 
    // implemented by MyIFImp: 
    System.out.println("User ID is " + obj.getUserID()); 
 
    // Can also call getAdminID(), because of default 
    // implementation: 
    System.out.println("Administrator ID is " + obj.getAdminID()); 
  } 
}
