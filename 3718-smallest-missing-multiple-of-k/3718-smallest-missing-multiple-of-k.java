class Solution {
    public int missingMultiple(int[] nums, int k) {

        int ans = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        for(int i = 1; i<nums.length+2; i++){
            if(!set.contains(k*i)){
                return k*i;
            }
        }

        return k;
        
    }
}