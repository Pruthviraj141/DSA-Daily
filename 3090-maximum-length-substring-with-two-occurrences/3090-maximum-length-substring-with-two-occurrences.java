class Solution {
    public int maximumLengthSubstring(String s) {
        
        int left = 0;
        int maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);

            while(map.get(s.charAt(right)) > 2){
                int leftval  = map.get(s.charAt(left));
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));

                }
                left++;

            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;

    }
}