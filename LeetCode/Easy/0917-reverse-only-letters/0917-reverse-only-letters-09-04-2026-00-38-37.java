class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        while(left < right){
            while(!Character.isLetter(s.charAt(left))){
                if(left <right){
                left++;

                }else{
                    break;
                }

            }
            while(!Character.isLetter(s.charAt(right))){
                                if(left <right){
                right--;

                }else{
                    break;
                }
            }
            char ch  = s.charAt(left);

            sb.setCharAt(left,s.charAt(right));
            sb.setCharAt(right,ch);

            left++;
            right--;


        }
        return sb.toString();
        
    }

}