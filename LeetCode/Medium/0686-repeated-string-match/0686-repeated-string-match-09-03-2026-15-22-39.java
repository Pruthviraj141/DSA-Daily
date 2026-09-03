class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s = a;
        if(s.contains(b)){
            return 1;
        }
        int cnt = 1;

        while(!s.contains(b)){
if(s.length() > a.length() + b.length()){
    return -1;
}
            cnt++;
            s = s + a;
        }
        return cnt;
    }
}