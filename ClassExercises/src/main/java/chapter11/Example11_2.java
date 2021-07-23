///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package chapter11;
//
///**
// *
// * @author Jaco
// */
//
//// MyThread variations. This version of MyThread
//// creates a Thread when its constructor is called and
//// stores it in an instance variable called thrd.
//// It also sets the name of the thread and provides
//// a factory method to create and start a thread.
//public class Example11_2 {
//  public static void main(String args[]) {
//    System.out.println("Main thread starting.");
//
//    MyThread mt = MyThread.createAndStart("Child #1");
//
//    for(int i=0; i < 50; i++) {
//      System.out.print(".");
//      try {
//        Thread.sleep(100);
//      }
//      catch(InterruptedException exc) {
//        System.out.println("Main thread interrupted.");
//      }
//    }
//
//    System.out.println("Main thread ending.");
//  }
//}
