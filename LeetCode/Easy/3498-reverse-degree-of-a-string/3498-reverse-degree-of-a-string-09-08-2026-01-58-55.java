class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int cnt = 1;
        for(char c :s.toCharArray()){
            
            int val = 26 - (c - 'a');
            sum = sum + cnt * val;
            cnt++;
        }
        return sum;
    }
}