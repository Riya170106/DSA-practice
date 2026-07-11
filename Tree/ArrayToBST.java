public class ArrayToBST {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode helper(int[]nums,int st,int end){
        if(st>end){
            return null;
        }
        int mid=st+(end-st)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,st,mid-1);
        root.right=helper(nums,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums,0,nums.length-1);
    }
    public static void main(String[] args){
        ArrayToBST s=new ArrayToBST();
        int[] nums={-10,-3,0,5,9};
        TreeNode root=s.sortedArrayToBST(nums);
        System.out.println(root.val);
    }
}

