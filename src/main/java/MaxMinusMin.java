import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     *
     * @param nums a List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums) {
        // Check for null or empty list
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        // Initialize min and max with the first element
        int min = nums.get(0);
        int max = nums.get(0);

        // Iterate through the list to find min and max values
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Calculate the difference
        return max - min;
    }

    // Example of how to use the difference method in a test case
    public static void main(String[] args) {
        MaxMinusMin maxMinusMin = new MaxMinusMin();

        // Example list
        List<Integer> numbers = List.of(3, 7, 1, 9, 4, 5);

        // Calculate and print the difference
        int result = maxMinusMin.difference(numbers);
        System.out.println("Difference between max and min: " + result);  // Output: 8
    }
}
