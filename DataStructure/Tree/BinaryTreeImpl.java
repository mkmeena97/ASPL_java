package DataStructure.Tree;

class Node{
    int data;
    Node left;
    Node right;

    public  Node(int data){
        this.data=data;
    }

}

public class BinaryTreeImpl {

    static Node root;

    public static void insert(int data){
        root = insertRecursion(root,data);
    }

    public static  Node insertRecursion(Node root, int data){
        if (root==null){
            root = new Node(data);
        } else if (data< root.data) {
            root.left=insertRecursion(root.left,data);
        } else if (data> root.data) {
            root.right = insertRecursion(root.right,data);
        }
        return root;
    }

    public static void inorder(){
        inorderRecursion(root);
    }

    public static void inorderRecursion(Node root){
        if (root!=null){
            inorderRecursion(root.left);
            System.out.print(root.data+" ");
            inorderRecursion(root.right);
        }
    }

    public static void preorder(){
        preorderRecursion(root);
    }

    public static void preorderRecursion(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }

    public static void postorder(){
        postorderRecursion(root);
    }

    private static void postorderRecursion(Node root) {
        if(root!=null){
            preorderRecursion(root.left);
            preorderRecursion(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {

        insert(8);
        insert(7);
        insert(12);
        insert(15);
        insert(2);
        insert(5);

        System.out.println("inorder Traversal");
        inorder();
        System.out.println();
        System.out.println("Preorder Traversal");
        preorder();
        System.out.println();
        System.out.println("postorder Traversal");
        postorder();

    }

}
