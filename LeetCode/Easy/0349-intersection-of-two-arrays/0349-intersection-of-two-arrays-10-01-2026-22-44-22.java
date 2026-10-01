class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int x:nums1){
            set1.add(x);

        }
         for(int x : nums2){
            if(set1.contains(x)){
                list.add(x);
                set1.remove(x);
            }
         }

                 return list.stream().mapToInt(Integer::intValue).toArray();
    
        
    }
}