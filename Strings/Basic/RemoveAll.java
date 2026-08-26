// public class RemoveAll {
//     public static void  main(String[] args){
//         StringBuilder sb = new StringBuilder("geeksforgeeks");
//            char ch = 'e';
//             // for(int i = 0; i < sb.length(); i++){
//             //     if(sb.charAt(i) == ch){
//             //        sb.delete(i,i+1);
//             //        i--;
//             //     }
//             // }

//             // for(int i = 0; i < sb.length(); i++){
//             //     if(sb.charAt(i) == ch){
//             //         sb.replace(i,i+1,"");
//             //         i--;
//             //     }
//             // }

//             String res = sb.toString();
//             sb = new StringBuilder(res.replace(String.valueOf(ch),""));
//             System.out.println(sb);
//     }
// }

// public class RemoveAll{
//     public static void main(String[] args){
//       StringBuilder sb = new StringBuilder("geeksforgeeks");
//       remove(sb,'e');
//       System.out.println(sb);
//     }

//     static void remove(StringBuilder s , char ch){
            
//         String str = s.toString();
//          StringBuilder sb = new StringBuilder(str.replace(String.valueOf(ch),""));
//          s = sb;
//          System.out.println(s);
//     }
// }