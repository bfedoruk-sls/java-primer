public class Ex4 { 
    
    // A method that returns a value.
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Two parameters, one returns answer.
    static int larger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // void means the method does something but hands nothing back.
    static void printBanner(String title) {
        System.out.println("===============");
        System.out.println("   " + title);
        System.out.println("===============");
    }

    public static void main(String[] args) {
        printBanner("Weather Report");

        double todayC = 21.0;
        System.out.printf("%.1f C is %.1f F%n", todayC, celsiusToFahrenheit(today));

        System.out.println("Warmer of 18 and 24: ", larger(18, 24));
    }
}