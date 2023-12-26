class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans = new int[2];
        ans[0] = ans[1] = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] + nums[right] == target){
                // they asked position so left + 1 
                // if they asked index then it is just ans[0] = left
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }
            else if(nums[left] + nums[right] < target){
                left = left + 1;
            }else{
                right = right - 1;
            }
        }
        return ans;
        
    }
}


// normal two sum
//     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//     for(int i = 0 ; i<nums.length ; i++){
//         int num = nums[i];
//         int check = target - num;
//         if(map.containsKey(check)){
//             ans[0] = map.get(check)+1;
//             ans[1] = i+1;
//             return ans;
//         }
//         map.put(nums[i], i);
//     }
//     return ans;
// }
// }