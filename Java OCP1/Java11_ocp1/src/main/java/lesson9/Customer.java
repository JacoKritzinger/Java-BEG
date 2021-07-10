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
public class Customer {
    public String name = "Will Smith";
    public int custID = 255;
    public String address;
    public int orderNum;
    public int age;
    
    public Customer(String myAddress, int myOrderNum, int myAge){
       myAddress = address;
       myOrderNum = orderNum;
       myAge = age;
       
        
    }
    
    
    public void displayCustomer() {
        System.out.println("Customer name: "+ name);
        System.out.println("Customer ID: "+ custID);
        System.out.println("Customer age: "+ age);
        System.out.println("Customer orderNum: "+ orderNum);
        System.out.println("Customer address: "+ address);
    }
    
}

