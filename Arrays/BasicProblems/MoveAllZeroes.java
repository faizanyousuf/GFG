public class MoveAllZeroes {
    public static void main(String[] args){

    } 
}
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        //Naive apporach mY appraoch
        // int zeroIndex = -1;
        // for(int i = 0; i < arr.length; i++){
            
        //     if(zeroIndex < 0 && arr[i] == 0){
        //         zeroIndex = i;
        //     }else if(arr[i] != 0 && zeroIndex != -1){
        //         int temp = arr[zeroIndex];
        //         arr[zeroIndex] = arr[i];
        //         arr[i] = temp;
        //         for(int k = zeroIndex+1; k <= i; k++){
        //             if(arr[k] == 0){
        //                 zeroIndex = k;
        //                 break;
        //             }
        //         }
        //     }
        // }
        
        // better Approach
        // int j = 0;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] != 0){
        //         arr[j] = arr[i];
        //         j++;
        //     }
        // }
        // for(int i = j; j < arr.length; j++){
        //     arr[j] = 0;
        // }
    }
}
