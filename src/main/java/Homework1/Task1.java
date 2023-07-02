package Homework1;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double firstNumber = scanner.nextInt();
            System.out.println("въведеното първо число е: " + firstNumber);
            double secondNumber = scanner.nextInt();
            System.out.println("въведеното второ число е: " + secondNumber);
            double thirdNumber = scanner.nextInt();
            System.out.println("въведеното трето число е: " + thirdNumber);
            System.out.println(" ");

            if (thirdNumber > firstNumber && thirdNumber < secondNumber) {
                System.out.println("Третото число е между първото и второто число");
                System.out.println("");
            } else {
                System.out.println("Третото число не е между първото и второто число");
            }
        }
    }


