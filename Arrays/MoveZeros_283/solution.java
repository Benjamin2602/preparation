package Arrays.MoveZeros_283;
import java.util.ArrayList;

public class solution {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("The array after moving zeros is ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0){
                // adding non zero values to the temp
                temp.add(nums[i]);
            }
        }
        // now adding the non zero values from temp to nums array
        int nonZeroSize = temp.size();
        for(int i = 0 ; i<nonZeroSize; i++) {
            nums[i] = temp.get(i);
        }
        // now filling zeros to the remaining space
        for(int i = nonZeroSize ; i<n ; i++){
            nums[i] = 0;
        }
        // return nums;
        

    }
    
}
