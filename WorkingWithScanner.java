/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author samuraipanzer
 */
public class WorkingWithScanner {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("enter an integer: ");
        number = keyboard.nextInt();
        System.out.println(number);
    }
}
