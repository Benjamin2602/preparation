class Solution {
    //o(N*N*N*logn) to o(n)
    public List<List<Integer>> threeSum(int[] nums) {
        //sort panidu
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet();
        if(nums==null || nums.length < 3){
            return new ArrayList<>();
        }
        for(int i = 0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            
        while(left<right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum==0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[left]);
                list.add(nums[right]);
                set.add(list);
                left++;
                right--;
            }else if(sum<0){
                left = left +1;
            }else{
                right = right -1;
            }
        }
    }
        
        return new ArrayList<>(set);
        
    }
}

//o(N*N*N*Logn)
        // for(int i = 0; i< nums.length-2 ; i++){
        //     for(int j = i+1; j<nums.length-1;j++){
        //         for(int k = j+1; k<nums.length; k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer>list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
        //      Collections.sort(list);
        //                 set.add(list);
        //             }
        //         }
        //     }
        // }