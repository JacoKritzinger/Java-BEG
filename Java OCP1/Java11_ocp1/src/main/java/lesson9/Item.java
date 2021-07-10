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
public class Item {
    private double price = 15.50;
    private int ID;
    private String description;
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return ID;
    }

    public void setID(int ID) {
        
        if ((ID >= 100)&&(ID <= 300)){
            this.ID = ID;
        }else{
            System.out.println("Incorrect ID. It should be between 100 and 300!");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public static int getNextID() {
        //return nextID;
    //}

    //public static void setNextID(int nextID) {
        //Item.nextID = nextID;
    //}
}

