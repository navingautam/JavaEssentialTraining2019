package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter first number: ");

        double d2 = getInput(sc, "Enter second number: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

}

