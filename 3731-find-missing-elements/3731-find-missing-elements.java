class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        Arrays.sort(nums);
        int l = nums[0];
        int m = nums[nums.length -1];

        List<Integer> list = new ArrayList<>();

        for(int i = l ; i<m; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}