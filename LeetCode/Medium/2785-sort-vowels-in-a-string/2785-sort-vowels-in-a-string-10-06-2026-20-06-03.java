class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                list.add(ch);

            }

        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char ch : s.toCharArray()){
        
        if("aeiouAEIOU".indexOf(ch) != -1){
            sb.append(list.get(index));
            index++;
        }
        else{
            sb.append(ch);
        }
        }
        return sb.toString();
        
    }
}