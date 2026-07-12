public class mindiff{
     TreeNode prev=null;
    int ans=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        return mindist(root);
    }
    public int mindist(TreeNode root) {
        if(root==null){
            return Integer.MAX_VALUE;
        }
        if(root.left!=null){
            int leftmin=mindist(root.left);
            ans=Math.min(ans,leftmin);
        }
        if(prev!=null){
            ans=Math.min(ans,root.val-prev.val);
        }
        prev=root;
        if(root.right!=null){
            int rightmin=mindist(root.right);
            ans=Math.min(ans,rightmin);
        }
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        mindiff solver = new mindiff();
        int result = solver.minDiffInBST(root);
        System.out.println("Minimum absolute difference is: " + result);
    }
}

