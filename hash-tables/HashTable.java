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
}
