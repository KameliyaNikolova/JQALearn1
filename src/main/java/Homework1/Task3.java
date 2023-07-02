package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете стойност за ч1: ");
        int num1 = scanner.nextInt();

        System.out.print("Въведете стойност за ч2: ");
        int num2 = scanner.nextInt();

        System.out.print("Въведете стойност за ч3: ");
        int num3 = scanner.nextInt();

        System.out.println("Стойностите преди размяната: ");
        System.out.println("ч1 = " + num1);
        System.out.println("ч2 = " + num2);
        System.out.println("ч3 = " + num3);

        int temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;

        System.out.println("Стойностите след размяната: ");
        System.out.println("ч1 = " + num1);
        System.out.println("ч2 = " + num2);
        System.out.println("ч3 = " + num3);

        int sum = num1 + num2;

        int difference = sum - num3;

        System.out.println("Сборът на ч1 и ч2: " + sum);
        System.out.println("Разликата между сбора и ч3: " + difference);

    }
}
