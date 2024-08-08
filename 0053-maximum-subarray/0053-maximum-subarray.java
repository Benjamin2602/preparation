class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            currMax = Math.max(nums[i],nums[i]+currMax);
            maximum = Math.max(currMax,maximum);
        }
        return maximum;
        
    }
}