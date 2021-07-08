/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;


import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;

/**
 *
 * @author Jaco
 */
public class DateObj {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
//        JapaneseDate jDate = JapaneseDate.from(myDate);
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);        
        System.out.println("Date in ISO_DATE_TIME format: " +sDate);
        
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Formatted with MEDIM FormatStyle: " +fDate);
        
        
    }
    
}
