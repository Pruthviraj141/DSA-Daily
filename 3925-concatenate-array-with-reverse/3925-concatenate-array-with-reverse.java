class Solution {
    public int[] concatWithReverse(int[] nums) {

     int[] arr = new int[nums.length * 2];

     int i = 0;
     int cnt = 0;

     int j=arr.length-1;

     while(i<j){
        arr[i] = nums[cnt];
        arr[j] = nums[cnt];
        cnt++;
        i++;
        j--;




     }

     return arr;


        
    }
}