class Solution {
    int result = 0;
    public int countSubstrings(String s) {
        int n = s.length();
        for(int i = 0; i<n ; i++){
            count(s,i,i); //for odd values
            count(s,i,i+1); //for even values
        }
        return result;
        
    }
    public void count(String s , int start , int end){
        while(start>=0 && end < s.length() && s.charAt(start)==s.charAt(end)){
            result++; // increasing the count
            start--;
            end++;
        }
    }
}
// example //aaa
// i=0 so start = 0 and end = 0 hence res = 1 //a
// start -- and end ++ so breaks
// count(s,i,i+1) calls so start = 0 and end = 1 hence res = 2 //aa
// start -- and end ++ so breaks
// i = 1  st = 1 end = 1 // aa
// start -- and end ++ so start = 0 and end = 2 // res=4 //aaa