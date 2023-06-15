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

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable(10); // Create a hash table of size 10
        myHashTable.set("grapes", 10000); // Set the value for the key "grapes"
        myHashTable.set("apples", 9); // Set the value for the key "apples"
        myHashTable.set("Java", 55); // Set the value for the key "Java"
        myHashTable.displayHashTable(); // Display the hash table
    }
}
