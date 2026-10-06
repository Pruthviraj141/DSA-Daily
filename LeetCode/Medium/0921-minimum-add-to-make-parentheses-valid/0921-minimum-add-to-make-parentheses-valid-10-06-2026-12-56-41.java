class Solution {
    public int minAddToMakeValid(String s) {
//         int close = 0;
//          int open = 0;
//          int ans = 0;



//          for(char ch : s.toCharArray()){

//             if(ch == '('){
//                 open++;
//             }else{
//                 close++;
//             }

//             if(open > close){

// ans = open - close;

//             }   else{
//                 ans = close - open;
//             }
//          }

//          return ans;

Deque<Character> st = new ArrayDeque<>();

for(char ch : s.toCharArray()){

    if(ch == ')' && !st.isEmpty() && st.peek() == '('){
        st.pop();
    }else{
        st.push(ch);
    }

}
return st.size();
    }
}