public static double calculateAverage(int[] values) {
    validate(values);

    int sum = 0;
    for (int value : values) {
        sum += value;
    }

    return (double) sum / values.length;
}