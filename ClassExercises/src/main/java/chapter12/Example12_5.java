/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author Jaco
 */
public class Example12_5 {
  public static void main(String args[]) {  
    TrafficLightSimulator tl =
      new TrafficLightSimulator(TrafficLightColor.GREEN); 

    Thread thrd = new Thread(tl);
    thrd.start();
 
    for(int i=0; i < 9; i++) { 
      System.out.println(tl.getColor()); 
      tl.waitForChange(); 
    } 
 
    tl.cancel(); 
  }  
}
