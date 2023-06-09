<details>
<summary>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.</summary>
 
 ## Approach 

**Hash Map:** The program uses a hash map to store the values from the input array nums as keys and their corresponding indices as values. This allows for efficient lookup of the complement value during the iteration.

## The time complexity of the operations:
The time complexity of this program is O(n), where n is the length of the nums array. The for loop iterates through each element of nums exactly once. The hash map operations, such as containsKey and put, have an average time complexity of O(1).
## Space complexity:
The space complexity of this program is `O(n)`, where n is the length of the nums array. In the worst case, all elements of nums are stored in the hash map.
## What are the corner cases of the problem?

**Empty Array:** The program handles the case when the nums array is empty. In this case, an empty array is returned.

**No Solution:** If there is no pair of numbers in nums that add up to the target, the program returns an empty array.
## Source Code Optimal

```
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
## Source Code Brute force

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
    // loop through each pair of integers in the array
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            // check if the sum of the pair equals the target
            if (nums[i] + nums[j] == target) {
                // if yes, return the indices of the pair
                return new int[] {i, j};
            }
        }
    }
    // if no such pair found, return null
    return null;
}
}
```

 </details>
<details>
<summary>Given two sorted arrays nums1 and nums2, we need to find the median of the merged sorted array.</summary>


### Approach:
1. Merge the two arrays into a single sorted array.
2. Find the median of the merged array.

### Corner Cases:
- If one of the arrays is empty, the median will be in the other array.
- If the combined length of both arrays is odd, the median will be the middle element.
- If the combined length of both arrays is even, the median will be the average of the two middle elements.

 ### Time and space complexity
**Time Complexity: O(m + n)** - Linear time complexity as we iterate through both arrays once.
**Space Complexity: O(m + n)** - The merged array requires space to store all the elements.
  
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

### Dry Run:
dry run the code using the given example: `nums1 = [1,2]`, `nums2 = [3,4]`.

1. Initialize `m` as 2 (length of `nums1`) and `n` as 2 (length of `nums2`).
2. Create a new array `merged` of size `m + n`, i.e., `merged` will have a size of 4.
3. Initialize three pointers: `i` for `nums1`, `j` for `nums2`, and `k` for `merged` (all starting from index 0).
4. Start the while loop. Since both `i` and `j` are less than their respective array lengths, the loop continues.
5. Compare the first elements of `nums1` and `nums2`. As 1 is less than 3, we assign `merged[0]` as 1 and increment `i` and `k` by 1.
6. The loop continues. Now compare the second elements of `nums1` and `nums2`. As 2 is less than 3, we assign `merged[1]` as 2 and increment `i` and `k` by 1.
7. Now, `nums1` has no more elements, but `nums2` still has elements. Copy the remaining elements of `nums2` to `merged`.
8. The loop ends. Both `i` and `j` are greater than or equal to their respective array lengths.
9. Calculate the median index as `(m + n) / 2`, which is 2 in this case.
10. Since the combined length of both arrays is even, return the average of `merged[1]` and `merged[2]`, i.e., (2 + 3) / 2.0 = 2.

  

</details>

  <details>
<summary>Push Operation In Array</summary>
    

The `PushOperationInArray` class demonstrates adding elements to an array using the `push` operation. It provides the following functionality:

- `push(Object item)`: Adds an item to the array.
- `get(int index)`: Retrieves the element at the specified index from the array.

### Usage

```java
PushOperationInArray pushData = new PushOperationInArray();
pushData.push("Aheer");
pushData.push(25);


The `PushOperationInArray` class demonstrates adding elements to an array using the `push` operation. It provides the following functionality:

- `push(Object item)`: Adds an item to the array.
- `get(int index)`: Retrieves the element at the specified index from the array.

PushOperationInArray pushData = new PushOperationInArray();
pushData.push("Aheer");
pushData.push(25);
```

The above code creates an instance of `PushOperationInArray`, adds the items "Aheer" and 25 to the array using the `push` method, and then prints the array elements.

### Class Details

#### Instance Variables

- `length`: An integer variable that represents the length of the array.
- `data`: An array of type `Object` to store the elements.

#### Methods

- `PushOperationInArray()`: Constructor that initializes the array with a length of 0.
- `push(Object item)`: Adds an item to the array.
- `get(int index)`: Retrieves the element at the specified index from the array.

### Technical Terminology

- Class: A blueprint for creating objects that defines the attributes and behaviors of an object.
- Instance variables: Variables defined within a class that hold the state or data of an object.
- Constructor: A special method used to initialize the state of an object when it is created.
- Array: A data structure that holds a fixed-size sequence of elements of the same type.
- `length`: An instance variable that keeps track of the length of the array.
- `data`: An instance variable that represents the array to store the elements.
- `Object`: The base class for all types in Java.
- `get`: A method that retrieves the element at a specified index from the array.
- `push`: A method that adds an item to the array.
- `Arrays.copyOf`: A method that creates a new array with a specified length and copies the elements from the original array.
- `main`: The entry point of the Java program.

    
</details>
 
 
 <details>
  <summary>88. Merge Sorted Array
</summary>


## Approach
Two-pointer approach: We can use a two-pointer approach to merge the arrays. We initialize three pointers: `lastIndexNum1`, `lastIndexNum2`, and `mergedIndex`. We iterate from the end of the arrays and compare elements to merge them into `nums1`. Finally, we handle the remaining elements in `nums2` and place them in the correct positions in `nums1`.

- Time Complexity: O(m + n)
  - The algorithm iterates through both `nums1` and `nums2` once, so the time complexity is proportional to the combined lengths of the arrays.
- Space Complexity: O(1)
  - The algorithm uses only a constant amount of extra space, regardless of the input size.

## Corner Cases
1. Empty `nums1` and `nums2`:
   - Both arrays are empty, resulting in no merging.
2. Empty `nums2`:
   - `nums2` is empty, so `nums1` remains unchanged.
3. Empty `nums1`:
   - `nums1` is empty, and the elements of `nums2` are placed in `nums1` in the required order.

## Dry Run

Initial:
```plaintext
nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3
```

| Iteration | lastIndexNum1 | lastIndexNum2 | mergedIndex | nums1                | nums2       |
|-----------|---------------|---------------|-------------|----------------------|-------------|
|           | 2             | 2             | 5           | [1, 2, 3, 0, 0, 0]   | [2, 5, 6]   |
| 1         | 2             | 2             | 4           | [1, 2, 3, 0, 0, 3]   | [2, 5, 6]   |
| 2         | 1             | 2             | 3           | [1, 2, 3, 0, 2, 3]   | [2, 5, 6]   |
| 3         | 0             | 2             | 2           | [1, 2, 3, 2, 2, 3]   | [2, 5, 6]   |
| 4         | 0             | 1             | 1           | [1, 2, 2, 2, 2, 3]   | [2, 5, 6]   |
| 5         | 0             | 1             | 0           | [1, 2, 2, 2, 2, 3]   | [2, 5, 6]   |
| 6         | -1            | 1             | -1          | [1, 2, 2, 2, 2, 3]   | [2, 5, 6]   |

Result: [1, 2, 2, 2, 3, 5, 6]
 </details>
 
 
 <details>
  <summary>Given an integer array nums, find the subarray with the largest sum, and return its sum.</summary>
  
  # Maximum Subarray Sum

This is a solution to the maximum subarray sum problem, which finds the contiguous subarray with the largest sum in a given array.

## Approach

The given code uses the brute force approach, iterating through each possible subarray and calculating its sum. It updates the maximum sum if a higher sum is found.

### Time Complexity

The time complexity of the brute force approach is O(n^2) because we have nested loops iterating through the array. For each element, we iterate through the remaining elements to calculate the subarray sum.

### Optimal Solution

To improve the time complexity, an optimal solution using Kadane's algorithm can be used. It has a time complexity of O(n) and is based on the observation that the maximum subarray sum at each index is either the element itself or the element added to the maximum subarray sum at the previous index.

### Space Complexity

The space complexity is O(1) because the code only uses a constant amount of extra space to store variables.

## Corner Cases

The code handles arrays of length 1 and negative numbers as well.

## Source Code

### Brute Force

```java
class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
```
  ###  Optimal Solution

  ```java
  class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}

  ```
                 
## Dry Run

| Iteration | i   | j   | nums[j] | currentSum | maxSum | i++ | j++ | currentSum > maxSum | maxSum = currentSum |
|-----------|-----|-----|---------|------------|--------|-----|-----|---------------------|---------------------|
| 0         | 0   | 0   | -2      | -2         | -2     | 1   | 0   | false               | -2                  |
| 1         | 1   | 1   | 1       | 1          | 1      | 2   | 1   | false               | 1                   |
| 2         | 2   | 2   | -3      | -2         | 1      | 3   | 2   | false               | 1                   |
| 2         | 2   | 3   | 4       | 2          | 2      | 3   | 4   | true                | 2                   |
| 2         | 2   | 4   | -1      | 1          | 2      | 3   | 5   | false               | 2                   |
| 2         | 2   | 5   | 2       | 3          | 3      | 3   | 6   | true                | 3                   |
| 2         | 2   | 6   | 1       | 4          | 4      | 3   | 7   | true                | 4                   |
| 2         | 2   | 7   | -5      | -1         | 4      | 3   | 8   | false               | 4                   |
| 2         | 2   | 8   | 4       | 3          | 4      |     |     |                     |                     |
| 3         | 3   | 3   | 4       | 4          | 4      | 4   | 3   | true                | 4                   |
| 3         | 3   | 4   | -1      | 3          | 4      | 4   | 5   | false               | 4                   |
| 3         | 3   | 5   | 2       | 5          | 5      | 4   | 6   | true                | 5                   |
| 3         | 3   | 6   | 1       | 6          | 6      | 4   | 7   | true                | 6                   |
| 3         | 3   | 7   | -5      | 1          | 6      | 4   | 8   | false               | 6                   |
| 3         | 3   | 8   | 4       | 5          | 6      |     |     |                     |                     |
| 4         | 4   | 4   | -1      | -1         | 6      | 5   | 4   | false               | 6                   |
| 4         | 4   | 5   | 2       | 1          | 6      | 5   | 6   | false               | 6                   |
| 4         | 4   | 6   | 1       | 2          | 6      | 5   | 7   | false               | 6                   |
| 4         | 4   | 7   | -5      | -3         | 6      | 5   | 8   | false               | 6                   |
| 4         | 4   | 8   | 4       | 1          | 6      |     |     |                     |                     |
| 5         | 5   | 5   | 2       | 2          | 6      | 6   | 5   | false               | 6                   |
| 5         | 5   | 6   | 1       | 3          | 6      | 6   | 7   | false               | 6                   |
| 5         | 5   | 7   | -5      | -2         | 6      | 6   | 8   | false               | 6                   |
| 5         | 5   | 8   | 4       | 2          | 6      |     |     |                     |                     |
| 6         | 6   | 6   | 1       | 1          | 6      | 7   | 6   | false               | 6                   |
| 6         | 6   | 7   | -5      | -4         | 6      | 7   | 8   | false               | 6                   |
| 6         | 6   | 8   | 4       | 0          | 6      |     |     |                     |                     |
| 7         | 7   | 7   | -5      | -5         | 6      | 8   | 7   | false               | 6                   |
| 7         | 7   | 8   | 4       | -1         | 6      |     |     |                     |                     |
| 8         | 8   | 8   | 4       | 4          | 6      |     |     |                     |                     |

Final Max Sum: 6  
  
 </details>
  
  <details>
   <summary>11. Container With Most Water</summary>
   Certainly! Here's the information you requested:

1. Approach used in the program:
   The program you provided uses the two-pointer approach. It initializes two pointers, `left` and `right`, which represent the leftmost and rightmost indices of the subarray being considered. The pointers start at the outer ends of the array and move towards each other, calculating the area between the heights at the pointers. The width of the subarray decreases with each iteration, and the height is determined by the minimum height between the two pointers. By updating the maximum area based on the calculated area, the pointers move inward until they meet, exploring all possible subarrays.

2. Space and time complexity:
   - Brute Force Solution:
     - Time Complexity: O(n^2) - The nested `for` loops iterate over all possible pairs of heights, resulting in a quadratic time complexity.
     - Space Complexity: O(1) - No additional space is used beyond the input array.

   - Optimal (Two-Pointer) Solution:
     - Time Complexity: O(n) - The two-pointer approach iterates over the array once, with the pointers moving inward until they meet, resulting in linear time complexity.
     - Space Complexity: O(1) - Only a constant amount of extra space is used to store the variables for the two pointers and the maximum area.

3. Corner Cases and Constraints:
   - The given solution assumes that the array `height` is not null and has at least two elements.
   - The heights in the array can be positive integers.
   - The program calculates the maximum area of a container that can be formed using the heights in the array.

4. Source Code:
   Here are the two versions of the program:

   Brute Force Solution:
   ```java
   class Solution {
       public int maxArea(int[] height) {
           int maxArea = 0;
           for (int i = 0; i < height.length - 1; i++) {
               for (int j = i + 1; j < height.length; j++) {
                   int length = Math.min(height[i], height[j]);
                   int width = j - i;
                   int area = length * width;
                   maxArea = Math.max(maxArea, area);
               }
           }
           return maxArea;
       }
   }
   ```

   Optimal (Two-Pointer) Solution:
   ```java
   class Solution {
       public int maxArea(int[] height) {
           int maxArea = 0;
           int left = 0;
           int right = height.length - 1;

           while (left < right) {
               int length = Math.min(height[left], height[right]);
               int width = right - left;
               int area = length * width;
               maxArea = Math.max(maxArea, area);

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
         
