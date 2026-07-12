class Solution {
    public int[] arrayRankTransform(int[] arr) {
                int n = arr.length;  // Get the size of the input array
        
        if (n == 0)          // If the array is empty, return an empty array
            return new int[0];  

        TreeSet<Integer> set = new TreeSet<>();

        for(int nn: arr){
            set.add(nn);
        }
        int rank = 1;


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int s : set){
            map.put(s,rank++);
        }
        int[] ans = new int[n];


        for(int i = 0 ; i<n; i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}