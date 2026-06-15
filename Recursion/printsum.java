public class printsum {
    public static void printsums(int n, int i, int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsums(n,i+1,sum);
       // System.out.println(i);
    }
    public static void main(String[] args){
        int n=10;
        int sum=0;
        int i=1;
        printsums(n,i,sum);
    }
}
