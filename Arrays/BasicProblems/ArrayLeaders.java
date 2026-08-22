public class ArrayLeaders {
    public static void main(String[] args){

    }
}
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int leader = 0;
        int len = arr.length-1;
        
        for(int i=len; i >= 0; i--){
            
            if(arr[i] >=  leader){
                leader = arr[i];
                list.add(0,leader);
            }
        }
        return list;
    }
}
