class Solution {

    public int sum(int n){
        int sum = 0; 
        while(n>0){
            int last = n % 10;
            sum = last + sum;
            n = n / 10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        
        for(int i =0 ; i<nums.length; i++){
            if(sum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
}