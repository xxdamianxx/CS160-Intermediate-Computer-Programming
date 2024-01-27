package data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode(T data) {
        this.data = data;
    }
    public static<T> void inOrder(TreeNode<T> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static<T> void preOrder(TreeNode<T> root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static<T> void postOrder(TreeNode<T> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static<T> void levelOrder(TreeNode<T> root) {
        Queue<TreeNode<T>> level = new LinkedList<>();
        level.add(root);
        while (!level.isEmpty()) {
            Queue<TreeNode<T>> nextLevel = new LinkedList<>();
            while (!level.isEmpty()) {
                TreeNode<T> node = level.poll();
                System.out.print(node.data + " ");
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            System.out.println();
            level = nextLevel;
        }
    }
}
