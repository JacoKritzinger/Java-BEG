/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

/**
 *
 * @author Jaco
 */
public class Shirt {
    
    public String description;
    public char colorCode;
    public double price;
    
    
    public Shirt() {
        description = "--description requird--";
        colorCode = 'U';
        price = 0.00;        
    }
    
    public void display() {
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
    }
}
