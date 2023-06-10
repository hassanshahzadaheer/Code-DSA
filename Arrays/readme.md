## Table of Contents

| Problem Name                                 | Time and Space Complexity | Approach             | Concept                                               |
| -------------------------------------------- | ------------------------- | -------------------- | ----------------------------------------------------- |
| [ContainerWithMostWater.java][link1]          | O(n)                      | Two Pointer          | [Container With Most Water](#container-with-most-water) |
| [DeleteAtIndexOperationInArray.class][link2]  | -                         | -                    | -                                                     |
| [FindIndexInArray.java][link3]                | O(n)                      | Hash Table           | [Two Sum](#two-sum)                                  |
| [FindLastIndexInArray.java][link4]            | O(n)                      | -                    | [Median of Two Sorted Arrays](#median-of-two-sorted-arrays) |
| [FindNumbersWithEvenNumber.java][link5]       | O(n)                      | -                    | [Push Operation In Array](#push-operation-in-array)   |
| [LeetCodeMergeSortedArray.java][link6]        | O(n)                      | Two Pointer          | [Merge Sorted Array](#merge-sorted-array)             |
| [MaximumSubarray.java][link7]                 | O(n)                      | Dynamic Programming | [Maximum Subarray Sum](#maximum-subarray-sum)         |
| [MedianTwoSortedArrays.java][link8]           | O(log(min(m, n)))         | Binary Search        | [Median of Two Sorted Arrays](#median-of-two-sorted-arrays) |
| [MergeSortedArrayOptimizeSolution.java][link9] | O(m + n)                  | Two Pointer          | [Merge Sorted Array](#merge-sorted-array)             |
| [MergeSortedArraySimpleSolution.java][link10]  | O(m + n)                  | Merge                | [Maximum Subarray Sum](#maximum-subarray-sum)         |
| [PushOperationInArray.java][link11]            | O(1)                      | -                    | [Push Operation In Array](#push-operation-in-array)   |
| [ReverseString.java][link12]                  | O(n)                      | Two Pointer          | [Median of Two Sorted Arrays](#median-of-two-sorted-arrays) |

[link1]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/ContainerWithMostWater.java
[link2]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/DeleteAtIndexOperationInArray.class
[link3]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/FindIndexInArray.java
[link4]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/FindLastIndexInArray.java
[link5]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/FindNumbersWithEvenNumber.java
[link6]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/LeetCodeMergeSortedArray.java
[link7]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/MaximumSubarray.java
[link8]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/MedianTwoSortedArrays.java
[link9]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/MergeSortedArrayOptimizeSolution.java
[link10]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/MergeSortedArraySimpleSolution.java
[link11]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/PushOperationInArray.java
[link12]: https://github.com/hassanshahzadaheer/Code-DSA/blob/main/Arrays/ReverseString.java

## Two Sum
<details>
<summary>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.</summary>
 
Approach:
- Hash Map: The program uses a hash map to store the values from the input array nums as keys and their corresponding indices as values. This allows for efficient lookup of the complement value during the iteration.

Time complexity: O(n)
- The for loop iterates through each element of nums exactly once. The hash map operations, such as containsKey and put, have an average time complexity of O(1).

Space complexity: O(n)
- In the worst case, all elements of nums are stored in the hash map.

Source Code:
```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}
```
</details>

## Median of Two Sorted Arrays
<details>
<summary>Given two sorted arrays nums1 and nums2, we need to find the median of the merged sorted array.</summary>

Approach:
1. Merge the two arrays into a single sorted array.
2. Find the median of the merged array.

Time complexity: O(m + n)
- The algorithm iterates through both nums1 and nums2 once, so the time complexity is proportional to the combined lengths of the arrays.

Space complexity: O(m + n)
- The merged array requires space to store all the elements.

Source Code:
```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        
        int medianIndex = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (merged[medianIndex - 1] + merged[medianIndex]) / 2.0;
        } else {
            return merged[medianIndex];
        }
    }
}
```
</details>

## Push Operation In Array
<details>
<summary>Push Operation In Array</summary>

The `PushOperationInArray` class demonstrates adding elements to an array using the `push` operation. It provides the following functionality:

- `push(Object item)`: Adds an item to
- `push(Object item)`: Adds an item to the array at the end.
- `display()`: Prints the elements of the array.

Source Code:
```java
class PushOperationInArray {
    private Object[] array;
    private int size;
    private int capacity;

    public PushOperationInArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.size = 0;
    }

    public void push(Object item) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size] = item;
        size++;
    }

    private void increaseCapacity() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
```
</details>

## Merge Sorted Array
<details>
<summary>Merge Sorted Array</summary>

The `MergeSortedArray` class provides a method to merge two sorted arrays into a single sorted array.

Approach:
1. Initialize three pointers: `i` for the first array, `j` for the second array, and `k` for the merged array.
2. Compare the elements at indices `i` and `j` and add the smaller element to the merged array.
3. Move the corresponding pointer (`i` or `j`) and the `k` pointer to the next position.
4. Repeat steps 2-3 until one of the arrays is fully processed.
5. Add any remaining elements from the unfinished array to the merged array.
6. Return the merged array.

Time complexity: O(m + n)
- The algorithm iterates through both arrays once, comparing and merging the elements. The time complexity is proportional to the combined lengths of the arrays.

Space complexity: O(m + n)
- The merged array requires space to store all the elements.

Source Code:
```java
class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
}
```
</details>

## Maximum Subarray Sum
<details>
<summary>Maximum Subarray Sum</summary>

The `MaximumSubarraySum` class provides a method to find the maximum sum of a contiguous subarray within an array.

Approach:
- The Kadane's algorithm is used to find the maximum subarray sum.
- Initialize two variables: `maxSum` and `currentSum` to store the maximum sum found so far and the sum of the current subarray.
- Iterate

 through the array:
    - Add the current element to `currentSum`.
    - If `currentSum` becomes negative, reset it to zero since a negative sum would only decrease the maximum sum.
    - Update `maxSum` if `currentSum` is greater than `maxSum`.
- Return `maxSum` as the result.

Time complexity: O(n)
- The algorithm iterates through the array once, performing constant-time operations.

Space complexity: O(1)
- The algorithm uses a constant amount of extra space.

Source Code:
```java
class MaximumSubarraySum {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
```
</details>

### Container With Most Water
<details>
<summary>Container With Most Water</summary>

The "Container With Most Water" problem aims to find the maximum area of water that can be trapped between two vertical lines in a given array of heights.

#### Approach:

The provided solution uses the two-pointer approach to solve the problem efficiently.

1. Initialize two pointers, `left` and `right`, pointing to the first and last elements of the array, respectively.
2. Calculate the current area between the lines represented by the `left` and `right` pointers. The area is determined by the width (the difference between the indices) and the height (the minimum height between the two pointers).
3. Update the maximum area if the current area is greater.
4. Move the pointer with the smaller height inward. If the height at the `left` pointer is smaller, move the `left` pointer one step to the right; otherwise, move the `right` pointer one step to the left.
5. Repeat steps 2-4 until the pointers meet (i.e., `left >= right`).

By iteratively comparing and updating the maximum area, this approach explores all possible combinations of lines and ensures that the maximum area is found.

#### Time and Space Complexity:

The two-pointer approach has a time complexity of O(n), where n is the number of elements in the array. The approach only requires a single pass through the array, comparing and updating the area in constant time.

The space complexity is O(1) since the approach uses a constant amount of extra space to store the pointers and the maximum area.

#### Source Code:

Here's the provided solution:

```java
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
```
</details>

         
