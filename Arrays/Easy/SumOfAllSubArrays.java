public class SumOfAllSubArrays{
    public static void main(String[] args){


    }
}
class Solution {
    public int subarraySum(int[] arr) {
        // code here
        
        //naive method worst code !
        // int sum = 0;
        // for(int i = 0; i< arr.length; i++){
            
        //     for(int j = 0; j < arr.length; j++){
                 
        //          for(int k = i; k <= j;k++){
        //              sum += arr[k];
        //          }
        //     }
        // }
        // return sum;
        
        // int result = 0;
        
        // for(int i = 0; i < arr.length; i++){
        //     int temp = 0;
        //     for(int j = i; j < arr.length; j++){
        //         temp += arr[j];
        //         result += temp;
        //     }
        // }
        // return result;
        
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            
            result += (((arr.length - i)*arr[i])*(i+1));
        }
        return result;
    }
}
