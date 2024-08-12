class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int curr = 0;
        int n = intervals.length;
        //intervals[0][1] < new[0] eg [2] < [4]
        while(curr < n && intervals[curr][1] < newInterval[0]){
            res.add(intervals[curr++]);
        }
        //merging the non overlapping here
        // eg [3] <= [8]
        while(curr < n && intervals[curr][0] <= newInterval[1]){
            // min() => start => 4,3 = 3
            newInterval[0] = Math.min(newInterval[0],intervals[curr][0]);
            //max() => end => 8,5 = 8
            newInterval[1] = Math.max(newInterval[1],intervals[curr][1]);
            curr ++;
        }
        res.add(newInterval);
        while(curr<n){
            res.add(intervals[curr++]);
        }
        return res.toArray(new int[res.size()][]);

    }
}