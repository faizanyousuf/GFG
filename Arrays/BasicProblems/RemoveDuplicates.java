public class RemoveDuplicates{
    public static void main(String[] args){

    }
}
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = arr.length-1;i > 0; i--){
            
            if(arr[i] == arr[i-1]){
                continue;
            }else{
                list.add(0,arr[i]);
            }
        }
        
        list.add(0,arr[0]);
        return list;
        
     
    }
}

