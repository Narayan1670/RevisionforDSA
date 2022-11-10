package com.company;

class Node {
    int key;
    Node left;
    Node right;
    Node(int k) {
        key = k;
    }


    int height(Node root)
    {
        if (root == null) {
            return 0;
        }
        else {
            return Math.max(height(root.left),height(root.right)) + 1;
        }
    }
    //  print nodes at k level
    void printKDist(Node root, int k)
    {
        if (root == null)  return;
        if (k == 0)  System.out.print(root.key + " ");
        else {
            printKDist(root.left,k-1);
            printKDist(root.right,k-1);
        }
    }
    int getSize(Node root)
    {
        if (root == null) {
            return 0;
        }
        else {
            return 1 + getSize(root.left) + getSize(root.right);
        }
    }
    int getMax(Node root)
    {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
        }
    }
    public int diameterOfBinaryTree(Node root) {
        int count = 0;
        helper(root, count);
        return count;

    }
    public void helper(Node root, int k) {
        if(root != null) {
            if(root.left != null){
                helper(root.left, k);
            }
            k++;
            if(root.right != null) {
                helper(root.right, k);
            }
        }
    }


}
