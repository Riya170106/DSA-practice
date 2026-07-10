public class SumTree{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        int new_val=root.val+leftsum+rightsum;
        root.val=new_val;
        return root.val;
    }
    public static void main(String[] args){
        SumTree s=new SumTree();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        s.sum(root);
        System.out.println(root.val);
    }
}