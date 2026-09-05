class Solution {
    public int firstStableIndex(int[] nums, int k) {
        

        int n = nums.length;

        if(n==1){
            return 0;
        }
int j = 0;
        int[] suffix = new int[n];
        int mx = Integer.MAX_VALUE;

    int mn = Integer.MAX_VALUE;

for(int i = n - 1; i >= 0; i--){
    mn = Math.min(mn, nums[i]);
    suffix[i] = mn;
}

        int m = nums[0];

        for(int i =0; i<n; i++){
            m = Math.max(nums[i],m);
            
            int ans = m - suffix[i];

            if(ans<=k){
                return i;
            }
        }
        return -1;
    }
}