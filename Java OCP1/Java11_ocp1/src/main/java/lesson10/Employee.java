/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10;

/**
 *
 * @author Jaco
 */
public class Employee {    
    public String name1 = "fred Smith";
    public String name2 = "fred Smith";
    
    public void areNamesEqual() {
        String result = (name1 == name2) ? "Name are the same" : "Name are not the same";
        System.out.println(result);
//        if (name1.equals(name2)) {
//            System.out.println("Same name.");             
//        }else {
//            System.out.println("Different name.");
//        
        }
            
     }  

