/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int x = scnr.nextInt();

        System.out.println("What is the second number? ");
        int y = scnr.nextInt();

        if (x == 0 && y == 0) {
            System.exit(0);
        }

        int add = x + y;
        int sub = x - y;
        int multiply = x * y;
        int div = x / y;

        System.out.format("%d + %d = %d\n", x, y, add);
        System.out.format("%d - %d = %d\n", x, y, sub);
        System.out.format("%d * %d = %d\n", x, y, multiply);
        System.out.format("%d / %d = %d", x, y, div);

    }
}
