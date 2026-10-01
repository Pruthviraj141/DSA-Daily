class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();

        int ans = 0 ;
int max = 0;


        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
                ans++;
            }
            else if(c == ')'){
                st.pop();
                ans--;
            }

            max = Math.max(ans,max);

            
        }
        return max;
    }
}