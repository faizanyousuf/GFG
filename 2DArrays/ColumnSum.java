class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        
        
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m;j++){
                sum += mat[j][i];
            }
            result[i] = sum;
        }
        return result;
    }
}