class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window approach
        int left = 0;
        int right =0;
        int max = 0;
        HashSet<Character>set = new HashSet<>();
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;  // removing the duplicates
            }else{
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(),max);
            }
        }
        return max;
        
    }
}