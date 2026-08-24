public class MissingAndDuplicate{
    public static void main(String[] args){


    }
}
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        //approach 1;
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        //approach 1;
        // ArrayList<Integer> list = new ArrayList<>();
        // long n = arr.length;
        // long actualSum = n*(n +1)/2;
        //  boolean [] visited = new boolean[arr.length];
        // int index = -1;
        // int sum = 0;
        // for(int i = 0; i < n; i++){
        //     visited[arr[i] - 1] = true;
        //     sum += arr[i];
        // }
        
        // for(int i = 0; i < n; i++){
        //     if(visited[i] == false){
        //         index = i;
        //     }
        // }
        // long missing = index + 1;
        // long duplicate = ((sum + missing)-actualSum);
        
        // list.add((int)duplicate);
        // list.add((int)missing);
           
        //   return list;
    }
}

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        //approach 1;
        ArrayList<Integer> list = new ArrayList<>();
        // long n = arr.length;
        // long actualSum = n*(n +1)/2;
        //  boolean [] visited = new boolean[arr.length];
        // int index = -1;
        // int sum = 0;
        // for(int i = 0; i < n; i++){
        //     visited[arr[i] - 1] = true;
        //     sum += arr[i];
        // }
        
        // for(int i = 0; i < n; i++){
        //     if(visited[i] == false){
        //         index = i;
        //     }
        // }
        // long missing = index + 1;
        // long duplicate = ((sum + missing)-actualSum);
        
        // list.add((int)duplicate);
        // list.add((int)missing);
           
        //   return list;
        
        // approach second!
        
        int [] freq = new int [arr.length];
        
        for(int i = 0; i < arr.length; i++){
            
            freq[arr[i] -1]++;
        }
        
        int missing = -1;
        int duplicate = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(freq[i] == 0){
                missing = i+1;
            }else if(freq[i] == 2){
                duplicate = i+1;
            }
        }
        
        list.add(duplicate);
        list.add(missing);
        return list;
    }
}
