public class minDepth {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public int minDepth(TreeNode root) {
       if(root==null){
        return 0;
       } 
       if(root.left==null&&root.right==null){
        return 1;
       }
       if(root.left==null){
         return minDepth(root.right)+1;
       }
       if(root.right==null){
         return minDepth(root.left)+1;
       }
       int leftHt=minDepth(root.left);
       int rightHt=minDepth(root.right);
       int depth=Math.min(leftHt,rightHt)+1;
       return depth;
    }
    public static void main(String[] args){
        minDepth obj=new minDepth();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(obj.minDepth(root));
    }
}

