class Solution {
    public int reverse(int x) {
        int reversedNum = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            // Check for potential overflow
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && lastDigit > 7))
                return 0;
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && lastDigit < -8))
                return 0;

            reversedNum = reversedNum * 10 + lastDigit;
            x = x / 10;
        }

        return reversedNum;
    }
}
