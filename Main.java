public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Panie !");

        int[] values = {4, 8, 2, 10, 6};

        System.out.println(getSummaryLabel());

        System.out.println("Average: " + StatisticsHelper.calculateAverage(values));
        System.out.println("Max: " + StatisticsHelper.calculateMax(values));
        System.out.println("Min: " + StatisticsHelper.calculateMin(values));
    }
    private static String getSummaryLabel() {
        return "Statistics summary - merged master and feature";
    }
}
