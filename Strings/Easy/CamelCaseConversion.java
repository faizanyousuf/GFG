// package Easy;
import java.util.StringTokenizer;
public class CamelCaseConversion {
    public static void main(String[] args) {
        

        String str = "i got selected as intern for geeksforgeeks";

       StringTokenizer st = new StringTokenizer(str);
       String s = st.nextToken();
       StringBuilder sb = new StringBuilder(s);
       char ch =
        s.charAt(0);
    //    sb.setCharAt(0);
    // char c = 65+('b'-'a');
    // System.out.println(c);

       System.out.println(s);
    }
}
