/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author Jaco
 */
public class HelloWorld {
    public static void main(String[] args) {
        
        int id = 6;
        
        System.out.println("NewID Preincrement: "+(++id));
        
        System.out.println("NewID Preincrement: "+(id++));
        
        int count = 15;
        int a,b,c,d;
        a = count++;
        b = count;
        c = ++count;
        d = count;
                
        System.out.println(a + ", " + b + ", " + c + ", " + d);
        
//        System.out.println( "Hello Java Bootcamp");
    }
        
}
    

