class Solution {
    public int scoreOfString(String s) {
int sum = 0;
        for(int i = 1 ; i < s.length(); i++){

            int ch  = s.charAt(i);
            int chh = s.charAt(i-1);      

            sum = sum + Math.abs(ch-chh);
            



        }
        return sum;
    }
}