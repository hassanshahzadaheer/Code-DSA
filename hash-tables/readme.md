Apologies for the oversight. Here's an updated version with the Best Case and Worst Case columns included in the table. Additionally, I have modified the toggle section to include the detailed information you mentioned.

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
        // Implementation goes here
    }
}
```
</details>

[Go to TwoSum.java](./TwoSum.java)

Feel free to modify and enhance this table as needed to accommodate future additions to your `hash-table` folder.
# TwoSum

This is a Java program that finds two elements in an array that sum up to a given target value. It uses a hash map to efficiently solve the problem in linear time complexity.

## Approach

The program uses a hash map to store the elements of the array as keys and their indices as values. It iterates through the array, calculates the complement for each element (target minus the current element), and checks if the complement exists in the hash map. If the complement exists, it means that there are two elements in the array whose sum is equal to the target. In this case, it returns the indices of those elements. If no such pair is found, it throws an exception indicating that there are no two elements that sum up to the target.

## Usage

To use the `TwoSum` program, follow these steps:

1. Create an instance of the `TwoSum` class.

2. Call the `twoSum` method, passing in the array of numbers and the target value as arguments.

3. The `twoSum` method returns an array containing the indices of the two elements that sum up to the target.

4. Print the result to see the indices and the corresponding values.

## Example

Here's an example usage of the `TwoSum` program:

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

In this example, the array `nums` contains the numbers [2, 7, 11, 15]. The target value is 9. The program finds that the numbers at indices 0 and 1 (2 and 7) sum up to the target value.

## Space Complexity

The space complexity of the `twoSum` method is O(n), where n is the number of elements in the array. This is because the program uses a hash map to store the elements of the array.

## Time Complexity

The time complexity of the `twoSum` method is O(n), where n is the number of elements in the array. This is because the program iterates through the array once and performs constant-time operations for each element.

## Edge Cases

The program handles the following edge cases:
- If there are no two elements in the array that sum up to the target, it throws an `IllegalArgumentException` with an appropriate error message.
- The program can handle negative numbers in the array and negative target values.

Feel free to modify the code according to your specific requirements and edge cases.
