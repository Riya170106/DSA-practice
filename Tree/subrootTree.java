public class subrootTree{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
     public boolean isidentical(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        boolean isleftsame=isidentical(p.left,q.left);
        boolean isrightsame=isidentical(p.right,q.right);
        return (isleftsame&&isrightsame&&p.val==q.val);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null&&subroot==null){
            return true;
        }
        if(root==null||subroot==null){
            return false;
        }
        if(root.val==subroot.val&&isidentical(root,subroot)){
            return true;
        }
        return (isSubtree(root.left,subroot)|| isSubtree(root.right,subroot));
    }
    public static void main(String[] args){
        subrootTree s=new subrootTree();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(4);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(2);
        TreeNode subroot=new TreeNode(4);
        subroot.left=new TreeNode(1);
        subroot.right=new TreeNode(2);
        System.out.println(s.isSubtree(root,subroot));
    }
}
