class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();



        for(int i = k-1; i>=0; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }

        for(int i = k ; i<s.length(); i++){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}