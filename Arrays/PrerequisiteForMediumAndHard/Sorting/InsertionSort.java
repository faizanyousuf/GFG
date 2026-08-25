public class InsertionSort {
    public static void main(String[] args){

    }
}
class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
        for(int i = 1; i < arr.length; i++){
            int j = i-1;
            int key = arr[i];
            
            while(j >= 0 && key < arr[j]){
                int temp = arr[j];
                arr[j] = key;
                arr[j+1] = temp;
                j--;
            }
        }
        
    }
}
