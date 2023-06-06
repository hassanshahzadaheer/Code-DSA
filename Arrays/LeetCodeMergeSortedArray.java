class LeetCodeMergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Index for the last element in nums1
        int lastIndexNum1 = m - 1;
        // Index for the last element in nums2
        int lastIndexNum2 = n - 1;
        // Current index for merging elements
        int mergedIndex = m + n - 1;

        // Merge elements from both arrays until either array is fully merged
        while (lastIndexNum1 >= 0 && lastIndexNum2 >= 0) {
            // Compare the elements at the last indices of nums1 and nums2
            if (nums1[lastIndexNum1] > nums2[lastIndexNum2]) {
                // Place the greater element at the merged index in nums1
                nums1[mergedIndex] = nums1[lastIndexNum1];
                // Decrement the index for nums1
                lastIndexNum1--;
            } else {
                // Place the greater element at the merged index in nums1
                nums1[mergedIndex] = nums2[lastIndexNum2];
                // Decrement the index for nums2
                lastIndexNum2--;
            }
            // Move to the next merged index
            mergedIndex--;
        }

        // Handle the remaining elements in nums2 (if any)
        while (lastIndexNum2 >= 0) {
            // Place the remaining element at the merged index in nums1
            nums1[mergedIndex] = nums2[lastIndexNum2];
            // Decrement the index for nums2
            lastIndexNum2--;
            // Move to the next merged index
            mergedIndex--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Create an instance of the Solution class
        Solution solution = new Solution();
        // Call the merge function to merge the arrays
        solution.merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
