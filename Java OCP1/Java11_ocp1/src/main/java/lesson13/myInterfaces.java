/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jaco
 */
public class myInterfaces {
    public static void main(String[] args) {
        String[] names = {"Sam", "James", "Rossouw", "Jaco", "Kyle", "Sobogile"};
        List< String>myList = Arrays.asList(names);
        
        myList.replaceAll(s ->s.toUpperCase());
        myList.removeIf(s->s.equals("Jaco"));
        
        System.out.println("myList.replaceAll Lambda: "+ myList);
        System.out.println(myList.removeIf(s->s.equals ("Jaco")));
        
        
    }
}