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
//public class MyThread implements Runnable {
    
//    11_1
//  String thrdName;
//
//  MyThread(String name) {
//    thrdName = name;
//  }
//
//  // Entry point of thread.
//  public void run() {
//    System.out.println(thrdName + " starting.");
//    try {
//      for(int count=0; count < 10; count++) {
//        Thread.sleep(400);
//        System.out.println("In " + thrdName +
//                           ", count is " + count);
//      }
//    }
//    catch(InterruptedException exc) {
//      System.out.println(thrdName + " interrupted.");
//    }
//    System.out.println(thrdName + " terminating.");
//  }
//}

//11_2

//  Thread thrd;
//
//  // Construct a new thread using this Runnable and give
//  // it a name.
//  MyThread(String name) {
//    thrd = new Thread(this, name);
//  }
//
//  // A factory method that creates and starts a thread.
//  public static MyThread createAndStart(String name) {
//    MyThread myThrd = new MyThread(name);
//    
//    myThrd.thrd.start(); // start the thread
//    return myThrd;
//  }
//
//  // Entry point of thread.
//  public void run() {
//    System.out.println(thrd.getName() + " starting.");
//    try {
//      for(int count=0; count<10; count++) {
//        Thread.sleep(400);
//        System.out.println("In " + thrd.getName() +
//                           ", count is " + count);
//      }
//    }
//    catch(InterruptedException exc) {
//      System.out.println(thrd.getName() + " interrupted.");
//    }
//    System.out.println(thrd.getName() + " terminating.");
//  }
//}

//11_3

//public class MyThread extends Thread {
//      // Construct a new thread.
//  MyThread(String name) {
//    super(name); // name thread
//  }
//
//  // Entry point of thread.
//  public void run() {
//    System.out.println(getName() + " starting.");
//    try {
//      for(int count=0; count < 10; count++) {
//        Thread.sleep(400);
//        System.out.println("In " + getName() +
//                           ", count is " + count);
//      }
//    }
//    catch(InterruptedException exc) {
//      System.out.println(getName() + " interrupted.");
//    }
//
//    System.out.println(getName() + " terminating.");
//  }
//}

//11_4

// Create multiple threads.

//class MyThread implements Runnable {
//  Thread thrd;
//
//  // Construct a new thread.
//  MyThread(String name) {
//    thrd = new Thread(this, name);
//  }
//
//  // A factory method that creates and starts a thread.
//  public static MyThread createAndStart(String name) {
//    MyThread myThrd = new MyThread(name);
//    
//    myThrd.thrd.start(); // start the thread
//    return myThrd;
//  }
//
//  // Entry point of thread.
//  public void run() {
//    System.out.println(thrd.getName() + " starting.");
//    try {
//      for(int count=0; count < 10; count++) {
//        Thread.sleep(400);
//        System.out.println("In " + thrd.getName() +
//                           ", count is " + count);
//      }
//    }
//    catch(InterruptedException exc) {
//      System.out.println(thrd.getName() + " interrupted.");
//    }
//    System.out.println(thrd.getName() + " terminating.");
//  }
//}

//11_6

// Use join().

//

//11_8

//class MyThread implements Runnable { 
//  Thread thrd; 
//  static SumArray sa = new SumArray(); 
//  int a[]; 
//  int answer; 
// 
//  // Construct a new thread. 
//  MyThread(String name, int nums[]) { 
//    thrd = new Thread(this, name); 
//    a = nums; 
//  } 
// 
//  // A factory method that creates and starts a thread.
//  public static MyThread createAndStart(String name, int nums[]) {
//    MyThread myThrd = new MyThread(name, nums);
//    
//    myThrd.thrd.start(); // start the thread
//    return myThrd;
//  }
//
//  // Entry point of thread. 
//  public void run() { 
//    int sum; 
// 
//    System.out.println(thrd.getName() + " starting."); 
// 
//    answer = sa.sumArray(a);          
//    System.out.println("Sum for " + thrd.getName() + 
//                       " is " + answer); 
// 
//    System.out.println(thrd.getName() + " terminating."); 
//  } 
//} 

//11_9

//class MyThread implements Runnable {  
//  Thread thrd;  
//  static SumArray sa = new SumArray();  
//  int a[];  
//  int answer; 
// 
//  // Construct a new thread.  
//  MyThread(String name, int nums[]) {  
//    thrd = new Thread(this, name);  
//    a = nums;  
//  }  
//  
//  // A factory method that creates and starts a thread.
//  public static MyThread createAndStart(String name, int nums[]) {
//    MyThread myThrd = new MyThread(name, nums);
//    
//    myThrd.thrd.start(); // start the thread
//    return myThrd;
//  }
//
//  // Entry point of thread.  
//  public void run() {  
//    int sum;  
//  
//    System.out.println(thrd.getName() + " starting.");  
//  
//    // synchronize calls to sumArray()  
//    synchronized(sa) {  
//      answer = sa.sumArray(a);           
//    }  
//    System.out.println("Sum for " + thrd.getName() +  
//                       " is " + answer);  
//  
//    System.out.println(thrd.getName() + " terminating.");  
//  }  
//}
//
//11_10

//class MyThread implements Runnable { 
//  Thread thrd; 
//  TickTock ttOb; 
// 
//  // Construct a new thread. 
//  MyThread(String name, TickTock tt) { 
//    thrd = new Thread(this, name); 
//    ttOb = tt; 
//  }
// 
//  // A factory method that creates and starts a thread.
//  public static MyThread createAndStart(String name, TickTock tt) {
//    MyThread myThrd = new MyThread(name, tt);
//    
//    myThrd.thrd.start(); // start the thread
//    return myThrd;
//  } 
//
//  // Entry point of thread. 
//  public void run() { 
// 
//    if(thrd.getName().compareTo("Tick") == 0) { 
//      for(int i=0; i<5; i++) ttOb.tick(true); 
//      ttOb.tick(false); 
//    } 
//    else { 
//      for(int i=0; i<5; i++) ttOb.tock(true); 
//      ttOb.tock(false); 
//    } 
//  } 
//} 

//11_12

// Suspending, resuming, and stopping a thread. 
 
class MyThread implements Runnable {  
  Thread thrd;  
  boolean suspended;  
  boolean stopped; 
    
  MyThread(String name) {  
    thrd = new Thread(this, name);  
    suspended = false;  
    stopped = false; 
  }
  
  // A factory method that creates and starts a thread.
  public static MyThread createAndStart(String name) {
    MyThread myThrd = new MyThread(name);
    
    myThrd.thrd.start(); // start the thread
    return myThrd;
  }  

  // Entry point of thread.  
  public void run() {  
    System.out.println(thrd.getName() + " starting."); 
    try {  
      for(int i = 1; i < 1000; i++) {  
        System.out.print(i + " ");  
        if((i%10)==0) { 
          System.out.println(); 
          Thread.sleep(250); 
        } 
 
        // Use synchronized block to check suspended and stopped. 
        synchronized(this) {  
          while(suspended) {  
            wait();  
          }  
          if(stopped) break; 
        }  
      }  
    } catch (InterruptedException exc) {  
      System.out.println(thrd.getName() + " interrupted.");  
    }  
    System.out.println(thrd.getName() + " exiting.");  
  }  
 
  // Stop the thread.  
  synchronized void mystop() {  
    stopped = true;  
 
   // The following ensures that a suspended thread can be stopped. 
    suspended = false; 
    notify(); 
  }  
 
  // Suspend the thread. 
  synchronized void mysuspend() {  
    suspended = true;  
  }  
 
  // Resume the thread.  
  synchronized void myresume() {  
    suspended = false;  
    notify();  
  }  
}
