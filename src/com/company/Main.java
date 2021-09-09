package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A, B, C;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        A = sc.nextInt();
        System.out.print("Enter Second number : ");
        B = sc.nextInt();
        System.out.print("Enter Third number : ");
        C = sc.nextInt();
        //
        if (A > B && A > C) {
            System.out.println(A + "  is largest in " );
        }
        else if (B > A && B > C) {
            System.out.println(B + "  is largest in ");
        }
        else {
            System.out.println(C + "  is largest");
        }

    }
}