public class occuranceofletter {
    public static int first=-1;
    public static int last=-1;
    public static void find_Occurance(String str,int idx,char element){
      if(idx==str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
      }
        char current_char=str.charAt(idx);
        if(current_char==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        find_Occurance(str,idx+1,element); //for character at next index
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        find_Occurance(str,0,'a');
    }
}
