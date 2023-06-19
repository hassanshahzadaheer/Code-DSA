class Solution {
    public int trap(int[] height) {
        
        int totalWater = 0;
        for (int i = 0 ; i < height.length; i++) {
            int leftHalf = i;
            int rightHalf = i;
            int maxLeft = 0;
            int maxRight = 0;

        // find maximum in left side
            while(leftHalf >= 0) {
                maxLeft = Math.max(maxLeft,height[leftHalf]);
                leftHalf --;
            }
            // find maximum in right side

            while(rightHalf < height.length) {
                maxRight = Math.max(maxRight, height[rightHalf]);
                rightHalf ++;
            }

            // update the current water 
            int currentWater = Math.min(maxLeft,maxRight) - height[i];
            if(currentWater >= 0) {
                totalWater += currentWater;
            }



        }

    return totalWater;
}
}
