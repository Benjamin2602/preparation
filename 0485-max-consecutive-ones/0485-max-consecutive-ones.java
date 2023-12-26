class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int counter = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]==1){
                counter++;
            }else{
                counter = 0;
            }
            maximum = Math.max(maximum, counter);
        }
        return maximum;
        
    }
}