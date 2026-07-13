public class KthSmallestelement {
    int prevorder=0;
    int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        if(root.left!=null){
            int leftans=kthSmallest(root.left,k);
            if(leftans!=-1){
                return leftans;
            }
        }
        if(prevorder+1==k){
            return root.val;
        }
        prevorder=prevorder+1;
        if(root.right!=null){
            int rightans=kthSmallest(root.right,k);
            if(rightans!=-1){
                return rightans;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        KthSmallestelement obj=new KthSmallestelement();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.right=new TreeNode(2);
        System.out.println(obj.kthSmallest(root,4));
    }
}
    
