public class subsequence {
    public static void subsequences(String str,int idx,String newstring){
        int n=str.length();
        if(idx==n){
            System.out.println(newstring);
            return;
        }
        char curr_char=str.charAt(idx);
        //to be includes
        subsequences(str,idx+1,newstring+curr_char);
        //not to be included
        subsequences(str,idx+1,newstring);
    }
    public static void main(String[]args){
        String str="abc";
        subsequences(str,0,"");
    }
}
