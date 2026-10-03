class Solution {
    public boolean squareIsWhite(String s) {
        char letter = s.charAt(0);
        int digit = s.charAt(1) - '0';

                if(letter == 'a' || letter == 'c' || letter == 'e' || letter == 'g'){

                    return digit % 2 == 0;
                }else{
                    return digit % 2 ==1;
                }
    }
}