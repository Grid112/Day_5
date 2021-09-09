package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A, B, Swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        A = sc.nextInt();
        System.out.println("Enter the value of B");
        B = sc.nextInt();
        System.out.println("before swapping numbers A: "+A);
        System.out.println("before swapping numbers B: "+B);
        Swap = A;
        A = B;
        B = Swap;
        System.out.println("After swapping A: "+A);
        System.out.println("After swapping B: "+B);


    }
}