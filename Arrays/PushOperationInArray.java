import java.util.Arrays;

public class PushOperationInArray {
    private int length;
    private Object[] data;

    // constructor
    public PushOperationInArray() {
        length = 0;
        data = new Object[0];
    }

    public Object get(int index) {
        return data[index];
    }
    // to add items into the array

    public void push(Object item) {
        data = Arrays.copyOf(data,length + 1);
        data[length] = item;
        length++;
    }

    public static void main(String[] args) {
        PushOperationInArray pushData = new PushOperationInArray();
        pushData.push("Aheer");
        pushData.push(25);

        System.out.println(Arrays.toString(pushData.data));
    }
}
