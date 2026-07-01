package subarrays;
public class majoritysubarray {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    count++;
                }
                if(count>(j-i+1)/2){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        int[]nums={2,2,2,2,1};
        int target=2;
        majoritysubarray obj=new majoritysubarray();
        System.out.println(obj.countMajoritySubarrays(nums,target));
    }
}
    
