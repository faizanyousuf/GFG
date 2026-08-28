public class FirstRepeatedChar {
    
}
class Solution {
    String firstRepChar(String s) {
        // code here
        int[] freq = new int[26];
        String result = "-1";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int index = ch-97;
            freq[index]++;
            if(freq[index] >= 2){
                result = String.valueOf(ch);
                break;
            }
        }
        return result;
    }
}
