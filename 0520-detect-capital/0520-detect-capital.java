class Solution {
    public boolean detectCapitalUse(String word) {
        
int n = 0;
boolean b = false;

        for(int i = 0 ; i < word.length() ; i++){

            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                n++;
            }

        }
        if(Character.isUpperCase(word.charAt(0)  ) && n==1  ){
    b = true;
}

        if(n==word.length() || b || n ==0){
            return true;
        }else{
            return false;
        }
    }
}