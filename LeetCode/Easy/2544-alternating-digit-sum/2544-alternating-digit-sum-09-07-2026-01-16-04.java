class Solution {
    public int alternateDigitSum(int n) {
        String st = String.valueOf(n);

        int sum  = 0; 

        for(int i =0 ; i < st.length(); i++){

            int digit = st.charAt(i) - '0';


            if(i % 2 == 0){
                sum = sum + digit;
            }else{
                sum = sum - digit;
            }
        }
        return sum ;
        
    }
}