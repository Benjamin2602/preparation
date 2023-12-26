class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>unique = new HashSet<>();

        // for(int i = 0 ; i<nums.length ; i++){
        //     int num = nums[i];
        // }

        //enhance loop nga
        for(int num : nums){
            if(unique.contains(num)){
                return true;
            }
            unique.add(num);
        }
        return false;
        
    }
}