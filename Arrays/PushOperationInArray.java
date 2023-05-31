import java.util.Arrays;

public class PushOperationInArray {
    private int length;       // Variable to track the length of the array
    private Object[] data;    // Array to store the elements

    // Constructor to initialize the array
    public PushOperationInArray() {
        length = 0;
        data = new Object[0];
    }

    public Object get(int index) {
        return data[index];   // Returns the element at the specified index
    }

    // Method to add items into the array
    public void push(Object item) {
        data = Arrays.copyOf(data, length + 1);   // Create a new array with increased length
        data[length] = item;                      // Assign the new item to the last position
        length++;                                 // Increment the length of the array
    }

    public static void main(String[] args) {
        PushOperationInArray pushData = new PushOperationInArray();   // Create an instance of PushOperationInArray class

        pushData.push("Aheer");   // Add "Aheer" to the array
        pushData.push(25);        // Add 25 to the array

        System.out.println(Arrays.toString(pushData.data));   // Print the array elements
    }
}
