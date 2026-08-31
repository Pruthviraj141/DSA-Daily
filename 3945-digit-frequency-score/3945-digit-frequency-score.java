class Solution {
    public int digitFrequencyScore(int n) {
        int num = n;
int ans = 0;
        while(num > 0){
            int last = num % 10;
            num = num / 10;
            ans +=last;
        }
        return ans;
    }
}