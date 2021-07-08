/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author Jaco
 */
//public class Shirt extends Clothing {
//    private int neckSize;
//
//    public int getNeckSize() {
//        return neckSize;
//    }
//
//    public void setNeckSize(int neckSize) {
//        this.neckSize = neckSize;
//    }
//    
//    
//    public static void main(String[] args) {
//        Shirt myShirt = new Shirt();
//        myShirt.setColor("Red");
//        myShirt.setSize('S');
//        myShirt.setType("Cloth");
//        myShirt.setPrice(250.00);
//        
//        myShirt.display();
//        
//    }
//}

public class Shirt extends Clothing {private int neckSize;
    
    public Shirt(String color, char size, String type, double price, int neckSize) {
        super (color, size, type, price);
        this.neckSize = neckSize;
    }
    
    @Override
    public void display(){
        System.out.println("Color: " + getColor());
        System.out.println("Size: " + getSize());
        System.out.println("Make: " + getType());
        System.out.println("Pricetag: " + getPrice());
        System.out.println("Neck Size: " + getNeckSize());
    }

    public int getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(int neckSize) {
        this.neckSize = neckSize;
    }
    
    
    public static void main(String[] args) {
        Shirt myShirt = new Shirt("Red", 'S', "Cloth", 250.00, 15);
        //myShirt.setColor("Red");
        //myShirt.setSize('S');
        //myShirt.setType("Cloth");
        //myShirt.setPrice(250.00);
        
        myShirt.display();
        
    }
}