class Solution {
    public int minMoves(int[] nums) {
        
        int min = nums[0];
        int res = 0;

        for(int n : nums){
            min = Math.min(min,n);
        }


        for(int n : nums){
            res += n - min;
        }
        return res;
    }
}