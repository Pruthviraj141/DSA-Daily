class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> set = new HashMap<>();
        for(int i  = 0; i<nums.length; i++){
            set.put(nums[i],i);

        }

        for(int i = 0; i<nums.length; i++){
            int rem = target - nums[i];
            if (set.containsKey(rem) &&set.get(rem) != i) {
                return new int[]{i, set.get(rem)};
            }
        }
return new int[] {};        
    }
}