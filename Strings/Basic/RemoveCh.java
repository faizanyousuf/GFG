public class  RemoveCh {
    public static void main(String[] args){
        String str = "geeksforgeeks";
        StringBuilder res = new StringBuilder(str);

        res.delete(3,4);
        System.out.println(res);


    }
}
