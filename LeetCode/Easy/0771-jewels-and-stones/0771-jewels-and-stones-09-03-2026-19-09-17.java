class Solution {
    public int numJewelsInStones(String j, String s) {
        
        int cnt =0;

     for(int i = 0; i < s.length(); i++){
        String ss= String.valueOf(s.charAt(i));
        
        if(j.contains(ss)){
            cnt++;
        }
     }
     return cnt;
    }
}