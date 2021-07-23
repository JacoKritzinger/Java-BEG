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


//9_2
public class ExcTest {
//  // Generate an exception. 
//  static void genException() { 
//    int nums[] = new int[4];  
// 
//    System.out.println("Before exception is generated."); 
//  
//    // generate an index out-of-bounds exception  
//    nums[7] = 10;  
//    System.out.println("this won't be displayed");  
//  } 
//}     
// 

//9_11

  static void genException() { 
    int nums[] = new int[4];  
 
    System.out.println("Before exception is generated."); 
 
    // generate an index out-of-bounds exception  
    nums[7] = 10;  
    System.out.println("this won't be displayed");  
  } 
}
