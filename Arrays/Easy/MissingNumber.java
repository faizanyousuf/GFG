public class MissingNumber {
    public static void main(String[] args) {
        
    }
}
class Solution {
    int missingNum(int arr[]) {
        // code here
        // long n = arr.length+1;
        // long sum = (n*(n + 1))/2;
        
        // for(int i = 0; i < arr.length;i++){
        //     sum -= arr[i];
        // }
        // return (int)sum;
        
        // Using Xor Operation
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            a = a^arr[i];
        }
        for(int i = 1; i <= arr.length+1; i++){
            b = b^i;
        }
        return a^b;
    }
}
