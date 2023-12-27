class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        int n = nums.length;

        // adding positive values to even (0,2,4)
        // adding negative values to odd (1,3,5)
        for(int i = 0; i<n;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }
        for(int i=0; i<n/2; i++){
            nums[2*i] = positive.get(i); // 0 2 4
            nums[2*i+1] = negative.get(i); // 1 3 5
        }
        return nums;
        
    }
}