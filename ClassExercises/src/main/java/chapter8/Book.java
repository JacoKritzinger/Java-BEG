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


public class Book {
    //8_1
//  private String title;  
//  private String author;  
//  private int pubDate;  
//  
//  Book(String t, String a, int d) {  
//    title = t;  
//    author = a;  
//    pubDate = d;  
//  }  
//  
//  void show() {  
//    System.out.println(title);  
//    System.out.println(author);  
//    System.out.println(pubDate); 
//    System.out.println(); 
//  }  
//} 

//8_2

//  private String title;  
//  private String author;  
//  private int pubDate; 
// 
//  // Now public. 
//  public Book(String t, String a, int d) {  
//    title = t;  
//    author = a;  
//    pubDate = d;  
//  } 
// 
//  // Now public. 
//  public void show() {  
//    System.out.println(title);  
//    System.out.println(author);  
//    System.out.println(pubDate);   
//    System.out.println(); 
//  }  
//}

//8_4

  // these are now protected 
  protected String title;  
  protected String author;  
  protected int pubDate; 
 
  public Book(String t, String a, int d) {  
    title = t;  
    author = a;  
    pubDate = d;  
  } 
 
   public void show() {  
    System.out.println(title);  
    System.out.println(author);  
    System.out.println(pubDate);   
    System.out.println(); 
  }  
}
