class Solution {
    public boolean checkValidString(String s) {

        int minOpen = 0;
        int maxOpen = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            }

            else if (ch == ')') {
                minOpen--;
                maxOpen--;
            }

            else { // '*'
                minOpen--;  // treat * as ')'
                maxOpen++;  // treat * as '('
            }

            // Even the maximum possible '(' is negative
            if (maxOpen < 0) {
                return false;
            }

            // We can't have negative minimum
            minOpen = Math.max(minOpen, 0);
        }

        return minOpen == 0;
    }
}