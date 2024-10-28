/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days1;

import java.util.Scanner;

/**
 *
 * @author Ebaad
 */
public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (one, two, three, four, five) in string");
        String code = in.next();
        Weekdays t = new Weekdays();
        t.nameOfDay(code);
    }
}