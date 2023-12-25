class Solution {
    public int removeDuplicates(int[] nums) {
        // optimized solution using two pointers
       int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    //         //declaring a hash set to store unique value
    //     // hashset removes dupicates
    //     HashSet<Integer>set = new HashSet<>();
    //     for(int i = 0 ; i<nums.length; i++){
    //         set.add(nums[i]);
    //     }
    //    // Storing the size of unique values
    //     int k = set.size();

    //     // Creating an array from the sorted set
    //     Integer[] sortedArray = set.toArray(new Integer[0]);
    //     Arrays.sort(sortedArray);

    //     // Copying unique elements back to the original array
    //     for (int i = 0; i < k; i++) {
    //         nums[i] = sortedArray[i];
    //     }

    //     return k;


        
    }
}