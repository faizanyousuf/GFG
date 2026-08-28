class Solution {
    public static boolean checkPangram(String s) {
        // code here
        
        boolean [] isPresent = new boolean[26];
        String str = s.toUpperCase();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch >= 65 && ch <= 90){
                int index = ch-65;
                isPresent[index] = true;
            }
        }
        
        for(int i = 0; i < isPresent.length; i++){
            if(isPresent[i] == false){
                return false;
            }
        }
        return true;
    }
}