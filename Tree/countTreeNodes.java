class countTreeNodes {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    public int countNodes(TreeNode root) {
       if(root==null){
        return 0;
       }
       int leftcount=countNodes(root.left);
       int rightcount=countNodes(root.right);
       return 1+leftcount+rightcount;
    }
    public static void main(String[]args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        countTreeNodes obj=new countTreeNodes();
        System.out.println(obj.countNodes(root));
    }
}