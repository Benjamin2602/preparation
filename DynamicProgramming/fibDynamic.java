package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class fibDynamic {
    public static int fib(int n , HashMap<Integer, Integer> dpMemo){

        if(n == 0 || n == 1){
            return n;
        }

        if(dpMemo.containsKey(n)){
            return dpMemo.get(n);
        }

        int result = fib(n-1 , dpMemo) + fib(n-2 , dpMemo);
        dpMemo.put(n, result);

        return result;

    }

    public static int fib(int n){
        return fib(n , new HashMap<Integer, Integer>());
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // nth fibonacci number
        sc.close(); 
        System.out.println("The nth fibonacci number is: ");
        System.out.println(fib(n));
    }

    
}
