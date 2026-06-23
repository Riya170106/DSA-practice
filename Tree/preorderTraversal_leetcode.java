import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
   }
 }
 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList <>();
        Stack<TreeNode> Stack=new Stack<>();
        if(root==null){
            return ans;
        }
        Stack.add(root);
        while(!Stack.isEmpty()){
            TreeNode node=Stack.pop();
            ans.add(node.val);
            if(node.right!=null){
                Stack.add(node.right);
            }
            if(node.left!=null){
                Stack.add(node.left);
            }
        }
        return ans;
    }
}
public class preorderTraversal_leetcode{
    public static void main (String[] args){
        Solution sol=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(3);
        System.out.println(sol.preorderTraversal(root));
    }
}