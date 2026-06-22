public class inorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            }
        }
    static class Binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node (nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    }
        public static void inorder(Node root){
            if(root==null){
                System.out.print("-1");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+"");
            inorder(root.right);
        }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=Binarytree.buildtree(nodes);       // calling using class name 'Binarytree'
        inorder(root);
    }
}
    
