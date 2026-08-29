class Solution {
    static String URLify(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            if(ch == ' '){
                sb.append("%20");
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}