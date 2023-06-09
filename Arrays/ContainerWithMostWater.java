class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;                  // Variable to store the maximum area
        int left = 0;                     // Left pointer starting at the leftmost index
        int right = height.length - 1;    // Right pointer starting at the rightmost index

        while (left < right) {            // While the two pointers haven't crossed each other
            int length = Math.min(height[left], height[right]);   // Calculate the minimum height between the two pointers
            int width = right - left;                            // Calculate the width of the subarray
            int area = length * width;                           // Calculate the area using height and width
            maxArea = Math.max(maxArea, area);                   // Update the maximum area if the current area is larger

            // Move the pointer with the smaller height towards the center
            if (height[left] < height[right]) {
                left++;                                          // Move the left pointer one step to the right
            } else {
                right--;                                         // Move the right pointer one step to the left
            }
        }

        return maxArea;                  // Return the maximum area
    }
}
