public class printheightlogn {
    public static int calpower(int x,int n) {
     if(n==0){
        return 1;
     }
     if(x==0){
        return 0;
     }
     //for even n
     if(n%2==0){
        //return calpower(x,n/2)*calpower(x,n/2);
        int xpower_n=calpower(x,n/2)*calpower(x,n/2);
        return xpower_n;
     }
     else{
        //for odd n
        //return calpower(x,n/2)*calpower(x,n/2) *x;   
        int xpower_n=calpower(x,n/2)*calpower(x,n/2) *x;
        return xpower_n;
     }
    }
    public static void main(String[] args) {
        int x=2;
        int n=7;
        int ans=calpower(x,n);
        System.out.println(ans);
    }
}

