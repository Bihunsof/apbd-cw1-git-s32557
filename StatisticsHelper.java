public class StatisticsHelper {

    public static double calculateAverage(int[] values) {
        validate(values);

        int sum = 0;
        for (int value : values) {
            sum += value;
        }

        return (double) sum / values.length;
    }

    private static void validate(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
    }

    public static int calculateMax(int[] values) {
        validate(values);

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }
    
}