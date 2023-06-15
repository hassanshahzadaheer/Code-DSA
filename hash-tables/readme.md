# Hash Table

| File Name      | Description                                      | Approach                                                         | Best Case | Worst Case | Go To                                                                                                                         |
|----------------|--------------------------------------------------|------------------------------------------------------------------|-----------|------------|-------------------------------------------------------------------------------------------------------------------------------|
| HashTable.java | Implementation of a basic hash table in Java.    | Separate Chaining                                                 | O(1)      | O(n)       | [Go to HashTable.java](./HashTable.java)                                                                                      |
| TwoSum.java    | Implementation of the Two Sum problem in Java.   | Hash Map                                                         | O(1)      | O(n)       | [Go to TwoSum.java](./TwoSum.java)                                                                                            |

## TwoSum.java
**Description**
The TwoSum class solves the Two Sum problem, which involves finding two elements in an array that sum up to a given target value. It uses a hash map to efficiently solve the problem.

**Approach**
Hash Map

<details>
<summary>Usage Example</summary>

```java
public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    int[] result = TwoSum.twoSum(nums, target);
    System.out.println("Indices: " + result[0] + ", " + result[1]);
    System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
}
```
Output:
```
Indices: 0, 1
Values: 2, 7
```
</details>

<details>
<summary>Code</summary>

```java
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
```
</details>

[Go to TwoSum.java](./TwoSum.java)
