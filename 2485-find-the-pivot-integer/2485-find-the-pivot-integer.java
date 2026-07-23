class Solution {
    public int pivotInteger(int n) {
        
        for(int p=1 ; p<=n;p++){
            int left = 0; 
            int right = 0;

            for(int i = 1; i<=p; i++){
                left+=i;
            }

            for(int i = p; i<=n;i++){
                right+=i;
            }

            if(left==right){
                return p;
            }


        }
        return -1;
    }
}