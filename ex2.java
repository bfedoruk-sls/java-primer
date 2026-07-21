import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = input.nextInt();

        System.out.print("Are you a student? (yes/no) ");
        String answer = input.next();

        double price;

        if (age < 13) {
            price = 8.00;
        } else if (age >= 65) {
            price = 10.00;
        } else if (answer.equals("yes")) {
            // Text is compared with .equals(), never with ==
            price = 12.00;
        } else {
            price = 16.50;
        }

        System.out.printf("Your ticket costs $%.2f%n", price);

        input.close();
    }
}