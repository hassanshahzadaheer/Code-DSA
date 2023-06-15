

# Hash Table

| File Name      | Description                                      | Approach                                                         | Best Case | Worst Case | Go To                                                                                                                         |
|----------------|--------------------------------------------------|------------------------------------------------------------------|-----------|------------|-------------------------------------------------------------------------------------------------------------------------------|
| HashTable.java | Implementation of a basic hash table in Java.    | Separate Chaining                                                 | O(1)      | O(n)       | [Go to HashTable.java](./HashTable.java)                                                                                      |
| TwoSum.java    | Implementation of the Two Sum problem in Java.   | Hash Map                                                         | O(1)      | O(n)       | [Go to TwoSum.java](./TwoSum.java)                                                                                            |

## HashTable.java
**Description**
The HashTable class provides an implementation of a basic hash table in Java. It uses separate chaining to handle collisions, where each element in the hash table is stored in a linked list at the corresponding index.

**Approach**
Separate Chaining

**Edge Cases**
- Empty Hash Table: If the hash table is empty and a `get` operation is performed, it will return null.
- Collision Handling: If there is a collision while adding elements to the hash table, the new element will be appended to the linked list at the corresponding index.

<details>
<summary>Usage Example</summary>

```java
public static void main(String[] args) {
        HashTable myHashTable = new HashTable(10);
        myHashTable.set("grapes", 10000);
        myHashTable.set("apples", 9);
        myHashTable.displayHashTable();
    }
```
Output:
```
Index 0: null
Index 1: null
Index 2: apples
Index 3: null
Index 4: null
Index 5: null
Index 6: null
Index 7: grapes
Index 8: null
Index 9: null
```
</details>

<details>
<summary>Code</summary>

```java
public class HashTable {
    private Object[] data; // Array to store data

    public HashTable(int size) {
        data = new Object[size]; // Initialize the array with the given size
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length; // Hash function to determine the index
        }
        return hash;
    }

    public void set(String key, Object value) {
        int index = hash(key); // Calculate the index based on the key
        data[index] = value; // Store the value at the calculated index
    }

    public Object get(String key) {
        int index = hash(key); // Calculate the index based on the key
        if (data[index] == null) {
            return null; // If the index is empty, return null
        }
        return data[index]; // Otherwise, return the value at the index
    }

    public void displayHashTable() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Index " + i + ": " + data[i]); // Display the index and its corresponding value
        }
    }
}
```
</details>

[Go to HashTable.java](./HashTable.java)

## TwoSum.java
**Description**
The TwoSum class solves the Two Sum problem, which involves finding two elements in an array that sum up to a given target value. It uses a hash map to efficiently solve the problem.

**Approach**
Hash Map

**Edge Cases**
- No Solution: If there are no two elements in the array that sum up to the target, the program throws an IllegalArgumentException with an appropriate error message.
- Negative Numbers: The program can handle negative numbers in the array and negative target values.

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
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two elements sum up to the target.");
    }
}
```
</details>

[Go to TwoSum.java](./TwoSum.java)
