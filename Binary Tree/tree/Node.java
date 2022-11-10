package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printPreOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.key + " ");
    }

    void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }
    void printPreOrderIterative(Node node) {

        if (node == null) {
            return;
        }

        Stack<Node> st = new Stack<Node>();
        st.push(root);


        while (!st.isEmpty())
        {
            Node newNode = st.peek();
            System.out.print(newNode.key + " ");
            st.pop();

            if(newNode.right != null) {
                st.push(newNode.right);
            }
            if(newNode.left != null) {
                st.push(newNode.left);
            }

        }
    }




    void printLevelOrder(Node node) {
        if (node == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    void printPostOrder() {
        printPostOrder(root);
    }

    void printInOrder() {
        printInOrder(root);
    }
    void printPreOrderIterative() {
        printPreOrderIterative(root);
    }

    void printPreOrder() {
        printPreOrder(root);
    }

    void printLevelOrder() {
        printLevelOrder(root);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);

//        System.out.println("Inorder traversal of binary tree is ");
//        tree.printInOrder();
//        System.out.println();
//        System.out.println("LevelOrder traversal of binary tree is ");
//        tree.printLevelOrder();
//        System.out.println();
        System.out.println("Inorder Iterative traversal of binary tree");
        tree.printPreOrderIterative();


    }
}