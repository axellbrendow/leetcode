public class KnapsackProblem01 {
    private static int knapsack01(int[] itemValues, int[] itemWeights, int knapsackCapacity) {
        int[][] maxValueConsideringNFirstItemsAndGivenCapacity = new int[itemValues.length + 1][knapsackCapacity + 1];

        for (int nFirstItems = 1; nFirstItems <= itemValues.length; nFirstItems++) {
            for (int currentCapacity = 1; currentCapacity <= knapsackCapacity; currentCapacity++) {
                final var currentItemWeight = itemWeights[nFirstItems - 1];
                maxValueConsideringNFirstItemsAndGivenCapacity[nFirstItems][currentCapacity] = currentItemWeight <= currentCapacity
                        ? Math.max(
                                maxValueConsideringNFirstItemsAndGivenCapacity[nFirstItems - 1][currentCapacity],
                                itemValues[nFirstItems - 1] +
                                        maxValueConsideringNFirstItemsAndGivenCapacity[nFirstItems - 1][currentCapacity
                                                - currentItemWeight])
                        : maxValueConsideringNFirstItemsAndGivenCapacity[nFirstItems - 1][currentCapacity];
            }
        }

        return maxValueConsideringNFirstItemsAndGivenCapacity[itemValues.length][knapsackCapacity];
    }

    public static void main(String[] args) {
        var testNumber = 0;

        int[] itemValues = new int[] { 4, 2, 10, 1, 2 };
        int[] itemWeights = new int[] { 12, 1, 4, 1, 2 };
        int knapsackCapacity = 15;
        int expectedMaxValue = 15;
        var output = knapsack01(itemValues, itemWeights, knapsackCapacity);
        var testPassed = output == expectedMaxValue;
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));
    }
}
