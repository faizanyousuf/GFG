import java.util.Stack;
public class Demo{
    public static void main(String[] args){

       Stack<Integer> st = new Stack<>();

       System.out.println(st.size());
    }
}

class Solution {
    public int celebrity(int mat[][]) {
        // code here
        
        Stack<Integer> st = new Stack<>();
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            st.push(i);
        }
        
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
          
          if(mat[a][b] == 0){
              st.push(a);
          }
          else if(mat[a][b] == 1){
              st.push(b);
          }
        }
        
        int celeb = -1;
        int lastEle = st.pop();
        int knows = 0;
        int isKnown = 0;
        
        for(int i = 0; i < n; i++){
            if(mat[lastEle][i] == 1){
                knows++;
            }
            if(mat[i][lastEle] == 1){
                isKnown++;
            }
        }
        
        if(knows == 1 && isKnown == n){
            celeb = lastEle;
        }
        
        return celeb;
        
    }
}