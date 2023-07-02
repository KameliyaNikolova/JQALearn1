package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първото цяло число: ");
        int num1 = scanner.nextInt();

        System.out.print("Въведете второто дробно число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Въведете третото цяло число: ");
        int num3 = scanner.nextInt();


        System.out.print("Въведете четвъртото дробно число: ");
        double num4 = scanner.nextDouble();

        int tempInt = num1;
        num1 = (int) num2;
        num2 = tempInt;

        double tempDouble = num3;
        num3 = (int) num4;
        num4 = tempDouble;

        System.out.println("Новите стойности след размяната: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int sum1 = (int) (num1 + num2);
        double sum2 = num3 + num4;

        System.out.println("Сумата след кастване от int към double: " + sum1);
        System.out.println("Сумата след кастване от double към int: " + (int) sum2);
    }
}

