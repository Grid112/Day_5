package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        int Power;
        int number = 0;

        System.out.println("Enter A No Until Which 2's Table Is Executed:");
        Scanner Sc = new Scanner(System.in);
        N = Sc.nextInt();

        if(number <= N) {
            for(int i=0 ; i<=N ; i++) {
                Power = (int) Math.pow(2 , i);

                System.out.println("2" + "^" + "=" + Power);
            }
        }
    }
}
