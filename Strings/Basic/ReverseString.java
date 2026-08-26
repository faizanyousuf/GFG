public class ReverseString {
    
}
class Solution {
    public static String reverseString(String s) {
        // code here
        // String res ="";
        // for(int i = s.length()-1; i >= 0; i--){
        //     res += s.charAt(i);
        // }
        // return res;
        // StringBuilder sb = new StringBuilder(s);
        // int i = 0;
        // int j = sb.length()-1;
        // while(i <= j){
        //     char temp = sb.charAt(i);
        //     sb.setCharAt(i,sb.charAt(j));
        //     sb.setCharAt(j,temp);
        //     i++;
        //     j--;
        // }
        // return sb.toString();
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            st.push(s.charAt(i));
        }
        
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}