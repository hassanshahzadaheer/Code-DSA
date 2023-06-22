import java.util.HashMap;

public class PairWithSum {
    public static int[] findPair(int[] nums, int target) {
        // Create a HashMap to store the complement of each number and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i]; // Calculate the complement for the current number

            // If the complement is present in the HashMap, return the pair
            if (complementMap.containsKey(complement)) {
                int complementIndex = complementMap.get(complement);
                return new int[]{nums[complementIndex], nums[i]};
            }

            complementMap.put(nums[i], i); // Add the number and its index to the HashMap
        }

        return new int[0]; // Return an empty array if no pair is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 1, 3, 7};
        int target = 10;

        int[] pair = findPair(nums, target);

        if (pair.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair found: " + pair[0] + ", " + pair[1]);
        }
    }
}





/* Space Complexity:

The space complexity of this code is O(n), where n is the length of the nums array. The HashMap (complementMap) stores the complement of each number as keys and their indices as values. In the worst case, the HashMap can store all the numbers in the nums array.
Time Complexity:

The time complexity of this code is O(n), where n is the length of the nums array. We iterate through the array once, performing constant-time operations within the loop.
The containsKey, get, and put operations on the HashMap take O(1) time complexity on average. Therefore, the overall time complexity is dominated by the single iteration through the array.

Edge Cases:

The code handles arrays with both positive and negative numbers.
It returns the first pair of numbers that sums up to the target value.
If no pair is found, it returns an empty array.
The code can handle empty arrays, in which case it will return an empty array as well.
If the nums array is null, the code will throw a NullPointerException. It's a good practice to handle such cases by adding appropriate null checks.
*/
