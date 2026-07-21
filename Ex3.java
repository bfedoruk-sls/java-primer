public class Ex3 {
    public static void main(String[] args) {
        // A  counted loop: run a fixed number of times.
        System.out.println("Countdown:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Liftoff!");

        // A while loop: run until a condition changes.
        int balance = 100;
        int weeks = 0;
        while (balance < 500) {
            balance = balance + 75;
            weeks++;
        }
        System.out.println("It took " + weeks + " weeks to save $500.");
    }
}