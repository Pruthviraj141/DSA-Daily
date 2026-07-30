class Solution {
    public int maximumProduct(int[] nums) {
        int sum = 1;
        int ans = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int n = nums.length;

        int pos = nums[n-3] * nums[n-2] * nums[n-1];
        int neg = nums[0] * nums[1] * nums[n-1];

        if(pos>neg){
            return pos;
        }
        return neg;
    }
}