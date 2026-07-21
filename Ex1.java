public class Ex1 {
    public static void main(String[] args) {
        String city = "Oshawa";
        int population = 175000;
        double averageTempC = 7.5;
        boolean isCoastal = false;

        System.out.println("City: " + city);
        System.out.println("Population: " + population);

        System.out.println("Population next year: " + (population + 2000));

        System.out.printf("Average temperature: %.1f C%n$", averageTempC);
        System.out.println("On the coast? " + isCoastal);
    }
}
