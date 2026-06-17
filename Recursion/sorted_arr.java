public class sorted_arr {
    public static boolean is_sorted(int arr[], int idx){
        int n=arr.length-1;
        if(idx==n){
            return true;
        }
        //if(arr[idx]<arr[idx+1]){        
           // return is_sorted(arr,idx+1);   
        //}                                
        //else{                            
            //return false;                  
        //}                  
        if(arr[idx]>=arr[idx+1]){   
            return false;          
        }
        else{
            return is_sorted(arr,idx+1);
        }
}
    public static void main(String []args){
        int arr[]={1,3,5,7,9};
        int arr1[]={1,2,2};
        System.out.println(is_sorted(arr,0));
        System.out.println(is_sorted(arr1,0));
    }
}
