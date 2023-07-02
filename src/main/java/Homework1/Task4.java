package Homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете брой работни часове: ");
        int workingHours = scanner.nextInt();

        System.out.print("Въведете сума пари: ");
        double moneyAmount = scanner.nextDouble();

        System.out.print("Дали е почивен ден (true/false): ");
       boolean isWeekend = scanner.nextBoolean();

       if (isWeekend && moneyAmount < 10) {
           System.out.println("Ще отида за сладолед");

       }

    }
}
