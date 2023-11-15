package org.example.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {
    static Scanner sc = new Scanner(System.in);
    public static int readInt(String message) {
        int input = 0;
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.nextInt();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }

    public static String readString(String message) {
        String input = "";
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.next();
                acceptedInput = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
}
