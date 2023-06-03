class FindNumbersWithEvenNumber {
    public int findNumbers(int[] nums) {
        
        // take mode 
        int mode = 0;
        // count the split digits
        int digitCounter = 0;
        
        // count how many even digit occour in given array
        int evenDigitCounter = 0;
        
        // count how many even digit occour in given array
        int oddDigitCounter = 0;
        
        // loop through numbers of array
        for (int i = 0; i < nums.length; i++) {
            
            // split digit untill the number in the array not equal to zero
            while(nums[i] != 0) {
                
                // calculate mode
                mode = nums[i] % 10;
                
                // to control loop
                nums[i] = nums[i] / 10;
                
                // increase the digit counter
                digitCounter ++;
            }
            // check for even digit if any 
            if (digitCounter % 2 == 0) {
                evenDigitCounter ++;
            } else {
                oddDigitCounter ++;
            }
            // reset counter to zero, so next number take it's own counter    
            digitCounter = 0;
        }
        // return all even numbers in given array
        return evenDigitCounter;
    }
}
