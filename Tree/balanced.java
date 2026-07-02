public class balanced{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHt=height(root.left);
        int rightHt=height(root.right);
        int diff=Math.abs(leftHt-rightHt);
        return diff<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int maxht=Math.max(left,right);
        return maxht+1;
    }
  public static void main(String[] args){
    balanced b=new balanced();
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    System.out.println(b.isBalanced(root));
  }
}