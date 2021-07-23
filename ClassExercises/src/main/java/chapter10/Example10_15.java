/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

// A simple disk-to-screen utilitiy that demonstrates a FileReader.

// This code requires JDK 7 or later.

import java.io.*;

/**
 *
 * @author Jaco
 */
public class Example10_15 {
  public static void main(String args[]) {
    String s;

    // Create and use a FileReader wrapped in a BufferedReader.
    try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
    {
      while((s = br.readLine()) != null) {
        System.out.println(s);
      }
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
