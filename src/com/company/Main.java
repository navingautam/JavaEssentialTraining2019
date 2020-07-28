package com.company;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        switch (monthNumber) {
            case 1:
                System.out.printf("The month is January");
                break;
            case 2:
                System.out.printf("The month is February");
                break;
            case 3:
                System.out.printf("The month is March");
                break;
            case 7:
            case 8:
                System.out.printf("It's the third quarter");
                break;
            default:
                System.out.printf("You chose another month");
        }

    }
}
