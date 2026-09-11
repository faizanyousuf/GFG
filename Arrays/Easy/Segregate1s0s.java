
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        
        // int k = 0;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == 0){
        //         int temp = arr[i];
        //         arr[i] = arr[k];
        //         arr[k] = temp;
        //         k++;
        //     }
        // }
        
         int i = 0;
         int j = arr.length-1;
        while(i != j){
            
            if(arr[i] == 0 && arr[j] ==1){
                i++;
            }else if(arr[i] == 1 && arr[j] == 1){
                j--;
            }else if(arr[i] == 0 && arr[j] == 0){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
        }
    }
}
