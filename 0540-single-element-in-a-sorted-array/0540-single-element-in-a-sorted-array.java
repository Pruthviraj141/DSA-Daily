class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = 0;
        for(int i = 1; i<nums.length; i+=2){
            if(nums[n] != nums[i]){
                return nums[n];
            }
            n=n+2;
        }
        return nums[nums.length-1];
    }
}