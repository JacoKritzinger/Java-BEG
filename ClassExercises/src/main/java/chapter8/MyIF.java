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

//8_20

public interface MyIF {
//  // This is a "normal" interface method declaration. 
//  // It does NOT define a default implementation. 
//  int getUserID(); 
// 
//  // This is a default method. Notice that it provides 
//  // a default implementation. 
//  default int getAdminID() { 
//    return 1; 
//  } 
//}

//8_25

  // This is a "normal" interface method declaration. 
  // It does NOT define a default implementation. 
  int getUserID(); 
 
  // This is a default method. Notice that it provides 
  // a default implementation. 
  default int getAdminID() { 
    return 1; 
  } 
 
  // This is a static interface method. 
  static int getUniversalID() { 
    return 0; 
  } 
}
