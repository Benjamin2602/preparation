class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        // if any ""string it returns 0 or if any string then 1
        int maxLen = Math.min(s.length(),1);
        HashSet<Character> seen = new HashSet<>();
        while(end < s.length()){
            // if the element already contains for example
            //in hashset <a,b,c> is there and the fourth char is a 
            // so need to remove the char which points at the start
            // <b,c,a> incremeting the start pointer to s.length(1)
            if(seen.contains(s.charAt(end))){
                seen.remove(s.charAt(start));
                start++;
            }
            else{
                //if no element contains then move the end pointer
                // add new element to the hashset 
                //<a>, <a,b> , <a,b,c>
                seen.add(s.charAt(end));
                int windowSize = end - start + 1;
                maxLen = Math.max(windowSize,maxLen);
                end++;
            }
        }
        return maxLen;
    }
}