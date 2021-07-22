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

//8_11

public class ByThrees implements Series { 
//  int start; 
//  int val; 
// 
//  ByThrees() { 
//    start = 0; 
//    val = 0; 
//  } 
// 
//  public int getNext() { 
//    val += 3; 
//    return val; 
//  } 
// 
//  public void reset() { 
//    start = 0; 
//    val = 0; 
//  } 
// 
//  public void setStart(int x) { 
//    start = x; 
//    val = x; 
//  } 
//}



//8_12

  int start; 
  int val; 
 
  ByThrees() { 
    start = 0; 
    val = 0; 
  }  
 
  public int getNext() { 
    val += 3; 
    return val; 
  } 
 
  public void reset() { 
    val = start; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
}