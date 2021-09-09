package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float HarmonicNumber = 1;
        int N;
        System.out.print("Enter the number to Check Harmonic expression (1+ 1/2 + 1/3 + ....+ 1/N) : ");
        Scanner Sc = new Scanner(System.in);
        N = Sc.nextInt();

        if(N != 0) {
            for(int i=1 ; i<=N ; i++) {
                HarmonicNumber += (float) 1 / i;
                System.out.println(HarmonicNumber);
            }
            System.out.println("");
            System.out.print("Harmonic Value of Number " + N + " is :  " + HarmonicNumber);
        }

    }
}