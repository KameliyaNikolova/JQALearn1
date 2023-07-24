package Homework2;

import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double average = averageSum(number1, number2);
        System.out.println("sumAverage: "+ average);
    }
    public static double averageSum(double number1, double number2) {
        double sumAverage = (number1 + number2) /2;
        return sumAverage;
    }
}