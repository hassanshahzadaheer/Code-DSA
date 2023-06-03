import java.util.Scanner;
import java.util.Arrays;
public class FindLastIndexInArray
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // taking input from user how many element to add into arra
        int n = input.nextInt();
        // make array to store user values
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++ ) {
            // get values
//         	int getInput = input.nextInt();
        	numbers[i] = input.nextInt();
    	}
    	System.out.println("Enter Target Value to find Index: ");
    	// find the value based on user input from array
        int target = input.nextInt();
        // set index to -1 in case we don't have user input inside array
    	int index = -1;

        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] == target) {
                index = i;
            }
    }
    	System.out.print(index);

	}

}
