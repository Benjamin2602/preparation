class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE, sum=0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            sum += nums[i];
            maxi = Math.max(maxi,sum);
            if(sum<0){
                sum = 0;
            }
            // for(int j = i; j<n ; j++){
            //     sum += nums[j];
            //     maxi = Math.max(maxi,sum);
            // }
        }
        return maxi;
    }
}