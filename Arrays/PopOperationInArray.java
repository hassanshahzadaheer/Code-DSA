import java.util.Arrays;
public class PopOperationInArray {

    private int length;
    private Object data[];

    public PopOperationInArray() {
        this.length = 0;
        this.data = new Object[0];
    }

    public Object get(int index) {
        return data[index];
    }

    public Object pop ()
    {
        if(length == 0) {
            return null;
        }

        Object deleteItem = data[length - 1];
        data = Arrays.copyOf(data,length-1);
        length--;
        return deleteItem;
    }

public static void main (String args[]) {

    PopOperationInArray delete = new PopOperationInArray();

    System.out.println(" ======= Before =======" );

    delete.data = new Object[] {"Aheer",65,98,7.5};
    delete.length = delete.data.length;
    System.out.println(Arrays.toString(delete.data));

    System.out.println(" ======= After =======" );
    delete.pop();
    System.out.println(Arrays.toString(delete.data));

}
}
