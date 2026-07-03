import java.util.Random;

public class NaroRainfall {
    public static void runAnalysis() {
        double[] readings = new double[30];
        Random rand = new Random();
        double total = 0;
        int wetDays = 0;

        for (int i = 0; i < readings.length; i++) {
            readings[i] = rand.nextDouble() * 60;
            total += readings[i];
            if (readings[i] > 30) wetDays++;
        }

        System.out.println("Total: " + total + " mm, Average: " + (total / 30) + " mm");
        System.out.println("Wet days: " + wetDays);
        if (total <= 300) System.out.println("Classification: Dry");
        else if (total <= 600) System.out.println("Classification: Normal");
        else System.out.println("Classification: Flood-risk");
    }
}