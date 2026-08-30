class Solution {
    public boolean checkDivisibility(int n) {
        int mul = 1;
        int ans = 0;
        int add = 0;
        int nn = n;

        while(nn>0){
            int last= nn % 10;
            nn = nn / 10;

            mul = mul * last;
            add = add + last;
        }

        ans = mul + add;
        if(n % ans ==0){
            return true;
        }else{
            return false;
        }

    }
}