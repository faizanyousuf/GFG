
class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        
        
    //     for(int i = 0; i < d; i++){
    //         int temp = arr[0];
    //         for(int j = 0; j < arr.length-1; j++){
    //             arr[j] = arr[j+1];
    //          }
    //         arr[arr.length-1] = temp; 
    // }
    
    // for(int val : arr){
    //     System.out.println()
    
    
    int[] temp = new int[arr.length];
    int k = 0;
            d = d%arr.length;
           for(int i = d; i < arr.length; i++){
               temp[k] = arr[i];
               k++;
           }
           
           for(int i = 0; i < d; i++){
               temp[k] = arr[i];
               k++;
           }
        //   for(int val : temp){
        //       System.out.println(val);
        //   }
           for(int i = 0; i< arr.length; i++){
               arr[i] = temp[i];
           }
    }
}