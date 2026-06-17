public class moveallX {
    public static void moveall_X(String str,int idx,int count,String newString){
        int n=str.length();
        if(idx==n){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curr_char=str.charAt(idx);
          if(curr_char=='x'){
            count++;
            moveall_X(str,idx+1,count,newString);
        }
        else{
            newString+=curr_char;
            moveall_X(str,idx+1,count,newString);
        }
    }
    public static void main(String [] args){
        String str="axbxcxdx";
        moveall_X(str,0,0,"");
    }
}
