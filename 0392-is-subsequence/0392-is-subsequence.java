class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = 0;

        if(s.length() == 0){
            return true;
        }
        for(int i = 0; i<t.length(); i++){
                                     if (n == s.length()) {
                break;
            }

            char ch = s.charAt(n);
            if(ch == t.charAt(i)){
                n++;
            }


        }
     
        return s.length() == n;
    }
}