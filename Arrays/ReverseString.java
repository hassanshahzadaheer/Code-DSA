import java.util.Arrays;

public class ReverseString {
    public static void main(String args[]) {

        String word = "Aheer!";

        // Iterate through each character of the word in reverse order
        for (int i = word.length() - 1; i >= 0; i--) {
            // Print the character at the current index
            System.out.print(word.charAt(i));
        }

    }
}
