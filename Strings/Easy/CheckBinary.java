package Easy;

public class CheckBinary {
    
}
class Solution {
    public boolean isBinary(String s) {
        // code here
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '1' || ch == '0'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}