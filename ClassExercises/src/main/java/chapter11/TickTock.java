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
//11_10
// Use wait() and notify() to create a ticking clock. 
 
//public class TickTock { 
//
//  String state; // contains the state of the clock
// 
//  synchronized void tick(boolean running) { 
//    if(!running) { // stop the clock 
//      state = "ticked";
//      notify(); // notify any waiting threads 
//      return; 
//    } 
// 
//    System.out.print("Tick "); 
//
//    state = "ticked"; // set the current state to ticked
//
//    notify(); // let tock() run 
//    try { 
//      while(!state.equals("tocked"))
//        wait(); // wait for tock() to complete 
//    } 
//    catch(InterruptedException exc) { 
//      System.out.println("Thread interrupted."); 
//    } 
//  } 
// 
//  synchronized void tock(boolean running) { 
//    if(!running) { // stop the clock 
//      state = "tocked";
//      notify(); // notify any waiting threads 
//      return; 
//    } 
// 
//    System.out.println("Tock"); 
//
//    state = "tocked"; // set the current state to tocked
//
//    notify(); // let tick() run 
//    try { 
//      while(!state.equals("ticked"))
//        wait(); // wait for tick to complete 
//    } 
//    catch(InterruptedException exc) { 
//      System.out.println("Thread interrupted."); 
//    } 
//  } 
//}  

//11_11

// No calls to wait() or notify(). 
class TickTock { 

  String state; // contains the state of the clock
 
  synchronized void tick(boolean running) { 
    if(!running) { // stop the clock 
      state = "ticked";
      return; 
    } 
 
    System.out.print("Tick "); 

    state = "ticked"; // set the current state to ticked
  } 
 
  synchronized void tock(boolean running) { 
    if(!running) { // stop the clock 
      state = "tocked";
      return; 
    } 
 
    System.out.println("Tock"); 

    state = "tocked"; // set the current state to tocked
  } 
}  
