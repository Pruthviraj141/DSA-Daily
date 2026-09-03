class Solution {
    public String defangIPaddr(String address) {
String s = "";
        for(char c : address.toCharArray()){
            if(c == '.'){
                s = s + "[.]";
                continue;
            }
            s = s + c;
        }
        return s;
        
    }
}