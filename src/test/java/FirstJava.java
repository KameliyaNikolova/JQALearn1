import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextInt ();
        System.out.println ("въведеното първо число е: " + firstNumber);
        double secondNumber = scanner.nextInt ();
        System.out.println ("въведеното второ число е: " + secondNumber);
        double thirdNumber = scanner.nextInt ();
        System.out.println ("въведеното трето число е: " + thirdNumber);
        System.out.println(" ");
    }
}