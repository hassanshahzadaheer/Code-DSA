import java.util.Arrays;
public class ReverseString {
    public static void main(String args[]) {

        String word = "Aheer!";

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

    }
}
