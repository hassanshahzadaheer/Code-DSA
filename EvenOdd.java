import java.util.Scanner;
public class EvenOdd {

    public static void main(String args[]) {
        int getNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        getNumber = input.nextInt();
        if (getNumber % 2 == 0) {
            System.out.println(getNumber + " is an even number.");
            } else {
            System.out.println(getNumber + " is an odd number.");
            }

    }
}
