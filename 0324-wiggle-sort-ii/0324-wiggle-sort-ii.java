class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length-1)/2;
        int end = nums.length-1;
        int []temp = new int[end+1];
        int count = 0;
        while(mid>=0 || end>(nums.length-1)/2){
            if(count % 2 ==0 ){
                temp[count] = nums[mid];
                mid--;
            }else{
                temp[count] = nums[end];
                end--;
            }
            count ++;
        }
        for(int i =0; i<nums.length;i++){
            nums[i] = temp[i];
            // System.out.print(temp[i]);
        }
    }
}