class Solution {
    public String smallestPalindrome(String s) {
        

        int[] arr = new int[26];

        for(char c : s.toCharArray()){
            arr[c - 'a'] ++;

        }


        StringBuilder left = new StringBuilder();

for (int i = 0; i < 26; i++) {
    for (int j = 0; j < arr[i] / 2; j++) {
        left.append((char) ('a' + i));
    }
}

char middle = '\0';

for (int i = 0; i < 26; i++) {
    if (arr[i] % 2 == 1) {
        middle = (char) ('a' + i);
        break;
    }
}

StringBuilder right = new StringBuilder(left);
right.reverse();

        if (middle != '\0') {
            return left.toString() + middle + right.toString();
        }

        return left.toString() + right.toString();
    }
}