import java.util.*;
public class subsetsII{
    public List<List<Integer>>subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        findsubsets(nums,ans,0,new ArrayList<>());
        return ans;
    }
    public void findsubsets(int[] nums,List<List<Integer>>ans,int idx,List<Integer>newset){
        if(ans.contains(newset)){
            return;
        }
        ans.add(new ArrayList<>(newset));
        for(int i=idx;i<nums.length;i++){
            newset.add(nums[i]);
            findsubsets(nums,ans,i+1,newset);
            newset.remove(newset.size()-1);
        }
    }
    public static void main(String [] args){
        subsetsII s=new subsetsII();
        int [] nums={1,2,2};
        List<List<Integer>> ans=s.subsets(nums);
        System.out.println(ans);
    }
}
