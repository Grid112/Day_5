package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int quotient, remainder, dividend, divisor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Dividend value : ");
        dividend = scanner.nextInt();

        System.out.print("Enter Divisor value : ");
        divisor = scanner.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder= " + remainder);
    }
}