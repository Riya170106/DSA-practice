public class TowerofHanoi {
    public static void Towerofhanoi(int n,String Source,String Helper,String Destination) 
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" from "+Source+" to "+Destination);  //base case
            return;
        }
        Towerofhanoi(n-1,Source,Destination,Helper); //source->destination using helper
        System.out.println("transfer disk "+n+" from "+Source+" to "+Destination);
        Towerofhanoi(n-1,Helper,Source,Destination); //helper->destination using source
    }
    public static void main(String[]args){
        int n=3;
        Towerofhanoi(n,"Source","Helper","Destination");
    }
}