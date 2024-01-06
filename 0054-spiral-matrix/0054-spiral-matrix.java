class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int left = 0;
        int right = col - 1;
        int bottom = row - 1;

        while(top<=bottom && left<=right){
            // left to right but in top
            for(int i = left; i<= right ; i++){
                ans.add(matrix[top][i]);
            }
             top++;
            //moving from top to bottom so (right la iruku)
            for(int i = top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
             right--;
            // right to left (bottom la iruku)
            if (top <= bottom) { // Check to avoid duplicate entries
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
          // bottom to top (left la iruku)
            if (left <= right) { // Check to avoid duplicate entries
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;

        
    }
}