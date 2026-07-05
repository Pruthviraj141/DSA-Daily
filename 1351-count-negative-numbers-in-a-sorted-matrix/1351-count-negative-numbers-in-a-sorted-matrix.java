class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        

        for(int[] roww : grid){
            int ans = roww.length;
            int findneg = find(roww);
            count = count + (col - findneg);
        }
        return count;
    }
    public int find(int[] roww){
        int left = 0;
        int right = roww.length -1;
        int ans = roww.length;

        while(left <=right){

            int mid = left + (right - left) /2;

            if(roww[mid] < 0){
                ans = mid;
                right = mid - 1;

            }else{
left = mid + 1;
            }
        }
        return ans;
    }
}