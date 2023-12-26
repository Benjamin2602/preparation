class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int d = n/2;
        for(int i = 0; i<n ; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count > d){
                return nums[i];
            }
        }
        return -1;
    }
}