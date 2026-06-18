import java.util.HashSet;
public class unique_subseq {
    public static void unique_subsequences(String str,int idx,String newstring,HashSet<String> set){
        int n=str.length();
        if(idx==n){
           if(set.contains(newstring)){
            return;
           } else{
            System.out.println(newstring);
            set.add(newstring);
            return;
           }
        }
        char curr_char=str.charAt(idx);
        //to be includes
        unique_subsequences(str,idx+1,newstring+curr_char,set);
        //not to be included
        unique_subsequences(str,idx+1,newstring,set);
    }
    public static void main(String [] args){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        unique_subsequences(str,0,"",set);
    }
}
