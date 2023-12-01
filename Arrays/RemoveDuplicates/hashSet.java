package Arrays.RemoveDuplicates;

import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        int arr[] = {1,1,2,24,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
          //Storing the size of unique values
        int k = set.size();

        // Creating an array from the sorted set
        Integer[] sortedArray = set.toArray(new Integer[0]);
        Arrays.sort(sortedArray);

        // Copying unique elements back to the original array
        for (int i = 0; i < k; i++) {
            arr[i] = sortedArray[i];
        }

        return k;
    }
}