public class QN4NARORainfall {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            /* logic */ }

        int day = 1;
        while (day <= 30) {
            day++;
            /* logic */ }
        System.out
                .println("part a. ");

        double[] dailyRainfall = new double[30]; // Single-dim: Stores one month
        double[][] annualData = new double[12][30]; // Multi-dim: Stores 12 months * 30 days
        System.out.println("PART b.");

        int[] r = { 12, 5, 20, 8, 15 };
        int t = 0;
        for (int i = 0; i < r.length; i++) {
            if (r[i] > 10)
                t += r[i];
        }
        System.out.println("Part (c) Output: " + t); // Result: 47

        NaroRainfall.runAnalysis();
    }
}