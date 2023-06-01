import java.util.Arrays;
public class MergeSortedArraySimpleSolution {


    public static void main(String[] args) {
        int[] array1 = {0,3,64,31,1};
        int[] array2 = {4,6,30};


        Arrays.sort(array1);
        Arrays.sort(array2);

        int size = array1.length + array2.length;
        int[] finalArray = new int[size];

        for (int i = 0; i < array1.length; i++)
        {
            finalArray[i] = array1[i];


        }
        for (int i = 0; i < array2.length; i++)
        {
            finalArray[array1.length + i] = array2[i];

        }

         System.out.println(Arrays.toString(finalArray));



    }
}
