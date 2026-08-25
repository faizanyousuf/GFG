public class LomutoPartition {
    public static void main(String[] args){
        int[] arr = {2,5,2,5,29,2,5,2,59,9,9,92,4,89};
        partition(arr);
    }
      static void partition(int[] arr){
    int pivot = arr[arr.length-1];
    int k = 0;
    for(int i = 0; i < arr.length -1; i++){
 
       if(arr[i] < pivot){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        k++;
       }
    }
    int temp = arr[k];
    arr[k] = pivot;
    arr[arr.length-1] = temp;

    for(int val : arr){
      System.out.print(val +" ");
    }

  }
}

