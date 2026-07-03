 public class sametree{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
 public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }if(p==null||q==null){
            return false;
        }
        boolean isleftsame=isSameTree(p.left,q.left);
        boolean isrightsame=isSameTree(p.right,q.right);
        return (isleftsame&&isrightsame&&p.val==q.val);
    }
  public static void main(String[] args){
    sametree s=new sametree();
    TreeNode p=new TreeNode(1);
    p.left=new TreeNode(2);
    p.right=new TreeNode(3);
    TreeNode q=new TreeNode(1);
    q.left=new TreeNode(2);
    q.right=new TreeNode(3);
    System.out.println(s.isSameTree(p,q));
  }
}