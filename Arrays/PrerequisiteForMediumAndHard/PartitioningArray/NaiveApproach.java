public class NaiveApproach{
    public static void main(String[] args){
      int[] arr = {5, 13, 6, 9, 12, 11, 8};
      // partitionArr(arr);
      // partition(arr);

      for(int val : arr){
        System.out.print(val+ " ");
      }
    }
  //  static void partitionArr(int[] arr){
  //    int [] temp = new int[arr.length];
  //    int pivot = arr[arr.length-1];
  //     int k = 0;
  //    for(int i = 0; i < arr.length-1; i++){
  //       if(arr[i] <= pivot){
  //           temp[k++] = arr[i];
            
  //       }
  //    }
  //    temp[k++] = pivot;
  //    for(int i = 0; i < arr.length-1; i++){
  //       if(arr[i] > pivot){
  //           temp[k++] = arr[i];
  //       }
  //    }

  //    for(int i = 0; i < arr.length; i++){
  //        arr[i] = temp[i];
  //    }
  //  }

}