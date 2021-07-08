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
public class myCalc {
        public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.sum(25,26));
        System.out.println(myCalculator.sum(25,50,150,5));
        System.out.println(myCalculator.sum(25,2, 12));
    }

}