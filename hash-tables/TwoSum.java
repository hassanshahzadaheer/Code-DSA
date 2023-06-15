import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store the complement values and their indices

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement for the current number
            if (map.containsKey(complement)) { // Check if the complement exists in the map
                return new int[] { map.get(complement), i }; // If found, return the indices of the two elements
            }
            map.put(nums[i], i); // Add the current number and its index to the map
        }

        throw new IllegalArgumentException("No two elements sum up to the target."); // If no solution is found, throw an exception
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 }; // Input array
        int target = 9; // Target sum
        int[] result = twoSum(nums, target); // Call the twoSum method to find the indices
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Print the indices
        System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]); // Print the values at the indices
    }
}
