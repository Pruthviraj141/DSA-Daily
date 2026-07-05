class Solution {
    public int countNegatives(int[][] grid) {
        

        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;

        int c = 0;
        int r = row - 1; //start from bottom of the row 

        while(r >= 0 && c < col){
            if(grid[r][c] < 0){
                ans = ans + (col - c);
                r--;
            }else{
                c++;
            }
        }
        return ans;
    }
}