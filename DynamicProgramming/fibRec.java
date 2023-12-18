package DynamicProgramming;

import java.util.Scanner;

public class fibRec {

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // nth fibonacci number
        System.out.println("The nth fibonacci number is: ");
        System.out.println(fib(n));
        sc.close(); 
    }
    
}
