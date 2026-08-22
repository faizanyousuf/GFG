public class AlternateElements{
    public static void main(String[] args){

    }
}
// import java.util.*;
class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i+=2){
            list.add(arr[i]);
        }
        return list;
        
    }
}