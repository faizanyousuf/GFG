public class CheckForSubsequence {
    
}
class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int k = 0;
        for(int i = 0; i < s2.length(); i++){
            char ch  = s2.charAt(i);
            if(k >= s1.length()){
                return true;
            }
            else if(ch == s1.charAt(k)){
                k++;
            }
        }
        if(k >= s1.length()){
            return true;
        }else{
            return false;
        }
    }
};
