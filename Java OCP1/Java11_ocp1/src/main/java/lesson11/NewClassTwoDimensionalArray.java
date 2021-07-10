/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;

/**
 *
 * @author Jaco
 */
public class NewClassTwoDimensionalArray {
    public static void main(String[] args) {
        int sales [] [] = new int [3] [3];
         sales[0][0] = 51454;
        sales[0][1] = 54512;
        sales[0][2] = 20515;
        sales[1][0] = 46354;
        sales[1][1] = 54846;
        sales[1][2] = 81515;

        System.out.println("Yearly sales by quarter beginning 2010: ");
        for(int i = 0; i < sales.length; i++){
            for(int x = 0; x < sales[i].length; x++){
                System.out.println("\tQ"+(x+1)+" "+sales[i][x]);
            }
            System.out.println("");
        }
    }  
}
