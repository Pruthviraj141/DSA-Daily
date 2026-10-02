class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
int idx=0;
        for(char ch : s.toCharArray()){
            if(k>idx){
                if(ch==' '){
                    idx++;
                }
                if(k>idx){
                sb.append(ch);

                }
            }
        }
        return sb.toString();
    }
}