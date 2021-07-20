/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author Jaco
 */
public class B extends A {
//  int i; // this i hides the i in A 
// 
//  B(int a, int b) { 
//    super.i = a; // i in A 
//    i = b; // i in B 
//  } 
// 
//  void show() { 
//    System.out.println("i in superclass: " + super.i); 
//    System.out.println("i in subclass: " + i); 
//  } 
//} 

//7_12
//  B() { 
//    System.out.println("Constructing B."); 
//  } 
//}

//7_16

//  int k; 
// 
//  B(int a, int b, int c) { 
//    super(a, b); 
//    k = c; 
//  } 
// 
//  // display k � this overrides show() in A 
//  void show() { 
//    System.out.println("k: " + k); 
//  } 
//}

//7_17

//  int k; 
// 
//  B(int a, int b, int c) { 
//    super(a, b); 
//    k = c; 
//  }
//  void show() { 
//    super.show(); // this calls A's show() 
//    System.out.println("k: " + k); 
//  } 
//}

//7_18

//  int k; 
// 
//  B(int a, int b, int c) { 
//    super(a, b); 
//    k = c;
//  } 
// 
//  // overload show() 
//  void show(String msg) { 
//    System.out.println(msg + k); 
//  } 
//}

//7_22

//  void meth() { // ERROR! Can't override.
//    System.out.println("Illegal!"); 
//  } 
}