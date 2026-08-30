class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int [] arr = new int[26];
        char result = '$';
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
             arr[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == 1){
                result = ch;
                break;
            }
        }
        return result;
    }
}
