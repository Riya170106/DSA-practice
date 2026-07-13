public class flattentree{
    TreeNode nextright=null;
     void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.left=null;
        root.right=nextright;
        nextright=root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flattentree solver = new flattentree();
        solver.flatten(root);

        // Print the flattened tree
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}
