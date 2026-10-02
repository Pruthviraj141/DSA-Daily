class Solution {
    public int maxPower(String s) {
        int ans = 0;
        int cnt = 0;
        for(int i = 1; i < s.length(); i ++){
            if(s.charAt(i-1) == s.charAt(i)){
                cnt++;
                ans = Math.max(ans,cnt);
            }
            else{
                cnt = 0;
            }
        }
            return ans+1;

    }
}