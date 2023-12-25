class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        int []ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0; i<nums.length ; i++){
            int num = nums[i];
            int check = target - num;
            if(temp.containsKey(check)){
                ans[0] = temp.get(check);
                ans[1] = i;
                return ans;
            }
            temp.put(nums[i],i);
        }
        return ans;
        
    }
}