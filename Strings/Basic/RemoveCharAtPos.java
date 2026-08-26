public class RemoveCharAtPos {

}
class Solution {
    // Function to search for a character in the string
    public int searchCharacter(String s, char ch) {
        // code here
    //   int index = -1;
    //     for(int i = 0; i < s.length(); i++){
    //             char cha = s.charAt(i);
    //         if(cha == ch){
    //             index = i;
    //             break;
    //         }
    //     }
    //     return index;
    
         return s.indexOf(ch);
    }
}