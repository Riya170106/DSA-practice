public class validateBST {
     private boolean helper(TreeNode root,TreeNode min,TreeNode max) {
        if(root==null){
            return true;
        }
        if(min!=null&&root.val<=min.val){
            return false;
        }
        if(max!=null&&root.val>=max.val){
            return false;
        }
        return (helper(root.left,min,root)&&helper(root.right,root,max));
    }
    private boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public static void main(String[] args){
        validateBST obj=new validateBST();
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);
        System.out.println(obj.isValidBST(root));
    }
}

