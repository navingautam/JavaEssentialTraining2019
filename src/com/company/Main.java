package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        var firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        var secondNumber = scanner.nextDouble();

        double result = firstNumber / secondNumber;

        System.out.println("The answer is " + result);
    }
}
