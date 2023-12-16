package Arrays.Merge2SortedArray;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of the first array");
        int m = sc.nextInt();
        System.out.println("size of the second array");
        int n = sc.nextInt();
        int [] a = new int[m];
        int [] b = new int[n];
        System.out.println("Enter the first array values");
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the second array values");
        for(int i = 0; i < n ; i++){
            b[i] = sc.nextInt();
        }

        System.out.println("After merging 2 sorted array of union");
        List<Integer> answer = sortedArray(a,b);
        for(int ans : answer){
            System.out.print(ans + " ");
        }

        sc.close();


        
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
     HashSet<Integer> s = new HashSet<Integer>();
     ArrayList<Integer> union = new ArrayList<Integer>();
 
     for(int i = 0; i < a.length; i++){
        s.add(a[i]);
     }
     for(int i = 0; i < b.length; i++){
        s.add(b[i]);
     }
     for(int it : s){
        union.add(it);
     }

        return union;
    }



    
}
