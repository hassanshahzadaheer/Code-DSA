import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> sumCount = new HashMap<>(); // Create a HashMap to store the count of each number

        int sum = 0; // Initialize the sum variable to 0
        for (int num : nums) {
            sumCount.put(num, sumCount.getOrDefault(num, 0) + 1); // Count the occurrences of each number using the HashMap
        }

        for (int num : nums) {
            if (sumCount.get(num) == 1) { // If the count of the number is 1, add it to the sum
                sum += num;
            }
        }
        return sum; // Return the final sum
    }
}
