class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums[nums.length -1];
        int nn = nums[nums.length -2];

        return (n-1) * (nn-1);

    }
}