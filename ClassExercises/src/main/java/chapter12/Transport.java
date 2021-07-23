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
//enum Transport {  
//  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
//} 

//12_3

// Use an enum constructor, instance variable, and method.  
enum Transport {  
  CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);  
  
  private int speed; // typical speed of each transport   
  
  // Constructor  
  Transport(int s) { speed = s; }  
  
  int getSpeed() { return speed; }  
}  
