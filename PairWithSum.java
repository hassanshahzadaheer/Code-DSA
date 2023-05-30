import java.util.HashMap;

public class PairWithSum {
    public static int[] findPair(int[] nums, int target) {
       HashMap<Integer, Integer> complementMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (complementMap.containsKey(complement)) {
                int complementIndex = complementMap.get(complement);
                return new int[]{nums[complementIndex], nums[i]};
            }

            complementMap.put(nums[i], i);
        }

        return new int[0];
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
