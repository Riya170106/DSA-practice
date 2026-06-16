public class printheight {
    public static int calpower(int x,int n) {
     if(n==0){
        return 1;
     }
     if(x==0){
        return 0;
     }
     int xpower_nm1=calpower(x,n-1);
     int xpower_n=x*xpower_nm1;
     return xpower_n;
    }
    public static void main(String[] args) {
        int x=2;
        int n=7;
        int ans=calpower(x,n);
        System.out.println(ans);
    }
}
