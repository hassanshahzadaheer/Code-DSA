

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
        HashTable myHashTable = new HashTable(10); // Create a hash table of size 10
        myHashTable.set("grapes", "10000"); // Set the value for the key "grapes"
        myHashTable.set("apples", "9"); // Set the value for the key "apples"
        myHashTable.set("Java", "55"); // Set the value for the key "Java"

        myHashTable.displayHashTable(); // Display the hash table

        String[] keys = myHashTable.getKeys(); // Get the keys from the hash table
        for (String key : keys) {
            System.out.println(key); // Print each key
        }

        Object[] values = myHashTable.getValues(); // Get the values from the hash table
        for (Object value : values) {
            System.out.println(value); // Print each value
        }
    }
```
Output:
```
Index 0: Empty
Index 1: Empty
Index 2: Empty
Index 3: grapes -> 10000
Index 4: Java -> 55
Index 5: Empty
Index 6: Empty
Index 7: Empty
Index 8: Empty
Index 9: apples -> 9
        
grapes
Java
apples
null
null
null
null
null
null
null
 
10000
55
9
null
null
null
null
null
null
null
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
        data[index] = new Object[] { key, value }; // Store the key-value pair at the calculated index
    }

    public Object get(String key) {
        int index = hash(key); // Calculate the index based on the key
        if (data[index] == null) {
            return null; // If the index is empty, return null
        }
        return ((Object[]) data[index])[1]; // Otherwise, return the value at the index
    }

    public void displayHashTable() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                Object[] pair = (Object[]) data[i];
                System.out.println("Index " + i + ": " + pair[0] + " -> " + pair[1]);
            } else {
                System.out.println("Index " + i + ": Empty");
            }
        }
    }

   public String[] getKeys() {
    String[] keys = new String[data.length];
    int currentKeyPosition = 0;
    for (int i = 0; i < data.length; i++) {
        if (data[i] != null) {
            keys[currentKeyPosition++] = ((Object[]) data[i])[0].toString();
            // Retrieve the key from the key-value pair stored at the index 'i'
            // Cast the key-value pair to Object[] and access the first element (key)
            // Convert the key to a string and assign it to 'keys' array
        }
    }
    return keys; // Return the array containing all the keys
}

public Object[] getValues() {
    Object[] values = new Object[data.length];
    int currentValuePosition = 0;
    for (int i = 0; i < data.length; i++) {
        if (data[i] != null) {
            values[currentValuePosition++] = ((Object[]) data[i])[1];
            // Retrieve the value from the key-value pair stored at the index 'i'
            // Cast the key-value pair to Object[] and access the second element (value)
            // Assign the value to the 'values' array
        }
    }
    return values; // Return the array containing all the values
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
