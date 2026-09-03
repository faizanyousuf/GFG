class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int celb = -1;
        int n = mat.length;
        for(int i = 0; i < n; i++){
        
             boolean isKnown = true;
             boolean knows = true;
             
             for(int j = 0; j < n; j++){
                 
                 if(mat[j][i] == 0){
                     isKnown = false;
                     break;
                 }
                 
                 if(mat[i][j] == 1 && i != j){
                     knows = false;
                     break;
                 }
             }
             
             if(isKnown && knows){
                 celb = i;
                 break;
             }
        }
        
        return celb;
    }
}