public class removeDuplicates {
    public static boolean[]map=new boolean[26];
    public static void remove_Duplicates(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char curr_char=str.charAt(idx);
        if(map[curr_char-'a']==true){
            remove_Duplicates(str,idx+1,newstring);
        }
        else{
        map[curr_char-'a']=true;
        newstring+=curr_char;
        remove_Duplicates(str,idx+1,newstring);
        }
    }
    public static void main(String []args){
        String str="abbccda";
        remove_Duplicates(str,0,"");
    }
}
