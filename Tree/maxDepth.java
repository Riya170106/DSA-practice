public class maxDepth{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }

    }
 public int maxDepth (TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHt=maxDepth(root.left);
        int rightHt=maxDepth(root.right);
        int depth=Math.max(leftHt,rightHt)+1;
        return depth;
    }

    
    public static void main(String[]args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        maxDepth obj=new maxDepth();
        System.out.println(obj.maxDepth(root));
    }
} 
