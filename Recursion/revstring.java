public class revstring {
    public static void printrev(String str,int idx) {
        if(idx==0){
            System.out.println(str.charAt(0));
            return;
        }
        System.out.println(str.charAt(idx));
        // System.out.print(str.charAt(idx));
        printrev(str,idx-1);
    }
    public static void main(String []args){
        String str="abcde";
        int n=str.length()-1;
        printrev(str,n);
    }
}
