import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        // An array: fixed size, decided when you create it. 
        double[] temperatures = {19.5, 22.0, 25.5, 24.0, 18.5};

        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum = sum + temperatures[i];
        }
        System.out.printf("Average temperature: %.2f%n", sum / temperatures.length);

        // An ArrayList: grows and shrinks as you go. 
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("God's Plan");
        playlist.add("One Dance");
        playlist.add("Hotline Bling");

        playlist.remove("One Dance");

        System.out.println("Tracks: " + playlist.size());

        // A for-each loop visits every element in turn. 
        for (String track : playlist) {
            System.out.println(" - " + track);
        } 
    }
}