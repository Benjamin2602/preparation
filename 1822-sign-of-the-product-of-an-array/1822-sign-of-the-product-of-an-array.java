class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;
        for(int i : nums){
            if(i==0) return 0;
            if(i<0) negative++;

        }
        return negative % 2 == 0 ? 1 : -1;
        
    }
}