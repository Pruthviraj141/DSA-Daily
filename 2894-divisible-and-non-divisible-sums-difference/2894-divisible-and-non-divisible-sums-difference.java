class Solution {
    public int differenceOfSums(int n, int m) {

        int num1 = 0;
        int num2 = 0;
        int cnt =1;

        while(cnt != n+1){
            if(cnt % m == 0){
                num1 += cnt;
            }else{
                num2 += cnt;
            }
            cnt++;
        }
        return num2 - num1;
    }
}