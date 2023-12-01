package Arrays;

//Problem Statement: Given an array, find the second smallest and second largest element in the array.
// Print ‘-1’ in the event that either of them doesn’t exist.

public class Element {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int[] result = getSecondOrderElements(n, a);
        System.out.println("Second largest element: " + result[0]);
        System.out.println("Second smallest element: " + result[1]);
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int largest = a[0];
        for(int i = 0 ; i<n ; i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        int smallest = a[0];
        for(int i = 0  ; i<n ; i++){
            if(a[i]<smallest){
                smallest = a[i];
            }
        }

         int secondLargest = -1;
        int secondSmallest = largest;

        for (int i = 0; i < n; i++) {
            if (a[i] != largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != smallest && a[i] < secondSmallest) {
                secondSmallest = a[i];
            }
        }

        int[] result = {secondLargest, secondSmallest};
        return result;
    }
}