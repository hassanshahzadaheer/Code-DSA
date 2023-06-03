import java.util.Arrays;

public class MergeSortedArrayOptimizeSolution {
   public static int[] mergeArrays(int[] array1, int[] array2) {
    int size1 = array1.length;
    int size2 = array2.length;
    int[] mergedArray = new int[size1 + size2];

    int array1Index = 0; // Index for array1
    int array2Index = 0; // Index for array2
    int mergedIndex = 0; // Index for mergedArray

    // Merge elements from array1 and array2
    while (array1Index < size1 && array2Index < size2) {
        // Compare the current elements from array1 and array2
        if (array1[array1Index] <= array2[array2Index]) {
            // If the element in array1 is smaller or equal, add it to mergedArray
            mergedArray[mergedIndex] = array1[array1Index];
            array1Index++; // Move to the next element in array1
        } else {
            // If the element in array2 is smaller, add it to mergedArray
            mergedArray[mergedIndex] = array2[array2Index];
            array2Index++; // Move to the next element in array2
        }
        mergedIndex++; // Move to the next position in mergedArray
    }

    // Add remaining elements from array1, if any
    for (; array1Index < size1; array1Index++, mergedIndex++) {
        mergedArray[mergedIndex] = array1[array1Index];
    }

    // Add remaining elements from array2, if any
    for (; array2Index < size2; array2Index++, mergedIndex++) {
        mergedArray[mergedIndex] = array2[array2Index];
    }

    return mergedArray;
}


    public static void main(String[] args) {
        int[] array1 = {0, 3, 31, 64};
        int[] array2 = {4, 6, 30};

        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
