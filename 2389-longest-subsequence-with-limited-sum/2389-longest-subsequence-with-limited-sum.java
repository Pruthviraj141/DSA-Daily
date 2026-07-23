class Solution {
    public int[] answerQueries(int[] nums, int[] q) {

        Arrays.sort(nums);

        int[] ans = new int[q.length];

        int[] n = new int[nums.length];
        int sum = 0;

        for(int i = 0; i<nums.length; i++){
            sum =  sum + nums[i];
            n[i] = sum;
        }

        int c = 0;


        for(int i = 0; i<q.length; i++){
            int count=0;
            for(int j = 0; j<nums.length; j++){
                if(q[i] >= n[j]){
                    count++;
                }else{
                    break;
                }
            }
            ans[c++] = count;
        }

        return ans;
    }
}