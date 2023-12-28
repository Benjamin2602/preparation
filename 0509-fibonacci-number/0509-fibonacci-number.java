class Solution {
    // dynamic programming
    public int fib(int n){
        return fib(n,new HashMap<>());
    }
    public int fib(int n , HashMap<Integer, Integer> memo) {
        if(n==0 || n==1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n); 
        }
        int res = fib(n-1) + fib(n-2);
        memo.put(n,res);
        return res;
        
    }
}