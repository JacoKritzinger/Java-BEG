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

//8_8 
//public class ByTwos {
//  int start; 
//  int val; 
// 
//  ByTwos() { 
//    start = 0; 
//    val = 0; 
//  }  
// 
//  public int getNext() { 
//    val += 2; 
//    return val; 
//  } 
// 
//  public void reset() { 
//    val = start; 
//  } 
// 
//  public void setStart(int x) { 
//    start = x; 
//    val = x; 
//  } 
//}

//8_10

//public class ByTwos implements Series { 
//  int start; 
//  int val; 
//  int prev; 
// 
//  ByTwos() { 
//    start = 0; 
//    val = 0; 
//    prev = -2; 
//  }  
// 
//  public int getNext() { 
//    prev = val; 
//    val += 2; 
//    return val; 
//  } 
// 
//  public void reset() { 
//    val = start; 
//    prev = start-2; 
//  } 
// 
//  public void setStart(int x) { 
//    start = x; 
//    val = x; 
//    prev = x - 2; 
//  } 
// 
//  int getPrevious() { 
//    return prev; 
//  } 
//}

//8_12

public class ByTwos implements Series { 
  int start; 
  int val; 
 
  ByTwos() { 
    start = 0; 
    val = 0; 
  }  
 
  public int getNext() { 
    val += 2; 
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
