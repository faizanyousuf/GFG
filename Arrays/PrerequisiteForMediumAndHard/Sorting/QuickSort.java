class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        
          if(low >= high){
              return;
          }else{
             int index =  partition(arr, low, high);
              quickSort(arr,low, index-1);
              quickSort(arr,index+1,high);
          }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        
        int pivot = arr[high];
        int k = low;
        
        for(int i = low; i < high; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        int temp = arr[k];
        arr[k] = arr[high];
        arr[high] = temp;
        
        return k;
    }
}