/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author Jaco
 */

// Use synchronize to control access. 
 
//11_8

//class SumArray { 
//  private int sum; 
// 
//  synchronized int sumArray(int nums[]) { 
//    sum = 0; // reset sum 
// 
//    for(int i=0; i<nums.length; i++) { 
//      sum += nums[i]; 
//      System.out.println("Running total for " + 
//             Thread.currentThread().getName() + 
//             " is " + sum); 
//      try { 
//        Thread.sleep(10); // allow task-switch 
//      } 
//      catch(InterruptedException exc) { 
//        System.out.println("Thread interrupted."); 
//      } 
//    } 
//    return sum; 
//  } 
//}  

//11_9

// Use a synchronized block to control access to SumArray.  
class SumArray {  
  private int sum;  
  
  int sumArray(int nums[]) {  
    sum = 0; // reset sum  
  
    for(int i=0; i<nums.length; i++) {  
      sum += nums[i];  
      System.out.println("Running total for " +  
             Thread.currentThread().getName() +  
             " is " + sum);  
      try {  
        Thread.sleep(10); // allow task-switch  
      }  
      catch(InterruptedException exc) {  
        System.out.println("Thread interrupted.");  
      }  
    }  
    return sum; 
  }  
}   


 
