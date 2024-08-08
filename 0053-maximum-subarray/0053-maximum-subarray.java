class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int temp = currMax + nums[i];
            if(temp<nums[i]){
                currMax = nums[i];
            }
            else{
                currMax = temp;
            }
            if(currMax > maximum){
                maximum = currMax;
            }
        }
        return maximum;
        
    }
}