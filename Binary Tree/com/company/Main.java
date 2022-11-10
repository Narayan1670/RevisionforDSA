package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        int h = root.height(root);
        int max = root.diameterOfBinaryTree(root);
        System.out.println(max);
//        root.printKDist(root,1);
//        System.out.println(root.getSize(root));
//        System.out.println(root.getMax(root));


    }

}
