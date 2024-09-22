package BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
         node.right=new Node(3);

         node.left.left=new Node(5);
         node.left.right=new Node(6);
         inorder(node);
    }
    public static void inorder(Node node){
        if(node==null)return;

        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

}
