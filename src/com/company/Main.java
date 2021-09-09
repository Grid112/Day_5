package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        character = scanner.next().charAt(0);
        switch (character) {
            case 'a':
                System.out.println(character + " : is an Vowel");
                break;
            case 'e':
                System.out.println(character + " : is an Vowel");
                break;
            case 'i':
                System.out.println(character + " : is an Vowel");
                break;
            case 'o':
                System.out.println(character + " : is an Vowel");
                break;
            case 'u':
                System.out.println(character + " : is an Vowel");
                break;
            case 'A':
                System.out.println(character + " : is an Vowel");
                break;
            case 'E':
                System.out.println(character + " : is an Vowel");
                break;
            case 'I':
                System.out.println(character + " : is an Vowel");
                break;
            case 'O':
                System.out.println(character + " : is an Vowel");
                break;
            case 'U':
                System.out.println(character + " + : is an Vowel");
                break;
            default:
                System.out.println(character + " : is an Consonent");
        }

    }
}