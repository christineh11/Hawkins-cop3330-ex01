/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("What is your name? ");
        String name= input.nextLine();

        System.out.printf("Hello, %s, nice to meet you!", name);

    }
}
