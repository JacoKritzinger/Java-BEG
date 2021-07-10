/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

/**
 *
 * @author Jaco
 */
public class Order {
    public static void main(String[] args){
        //Customer cust = new Customer ();
        Item item1 = new Item();
        item1.setPrice(100);
        item1.setID(15);
        item1.setDescription("White Gholf Balls");
        
        System.out.println("The price: R" + item1.getPrice());
        System.out.println("Item ID"+ item1.getId());
        System.out.println("Item Description"+ item1.getDescription());
                
    }
}