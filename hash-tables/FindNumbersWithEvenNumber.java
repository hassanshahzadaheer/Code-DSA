import java.util.HashMap;

class FindNumbersWithEvenNumber {
    public int findNumbers(int[] nums) {
        int evenDigitCounter = 0;
        
        for (int num : nums) {
            int digitCounter = countDigits(num);
            if (digitCounter % 2 == 0) {
                evenDigitCounter++;
            }
        }
        
        return evenDigitCounter;
    }
    
    private int countDigits(int num) {
        int count = 0;
        
        while (num != 0) {
            num = num / 10;
            count++;
        }
        
        return count;
    }
}
