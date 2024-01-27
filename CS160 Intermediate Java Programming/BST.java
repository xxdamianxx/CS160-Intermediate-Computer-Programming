package data_structures;

public class BST<T extends Comparable<T>> {
    public TreeNode<T> root;

    public boolean contains(T value) {
        TreeNode<T> curr = this.root;
        while (curr != null) {
            int result = value.compareTo(curr.data);
            if (result < 0) {
                curr = curr.left;
            } else if (result == 0) {
                return true;
            } else {
                curr = curr.right;
            }
        }
        return false;
    }

    public void add(T value) {
        TreeNode<T> newNode = new TreeNode<>(value);
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        TreeNode<T> curr = this.root;
        while (true) {
            int result = value.compareTo(curr.data);
            // Should be inserted in the left subtree
            if (result < 0) {
                if (curr.left == null) {
                    curr.left = newNode;
                    return;
                }
                curr = curr.left;
            } else {
                // Should be inserted in the right subtree
                if (curr.right == null) {
                    curr.right = newNode;
                    return;
                }
                curr = curr.right;
            }
        }
    }


    public void remove(T value) {
        this.root = removeNode(this.root, value);
    }

    // Remove the node and return the root of the updated tree
    private TreeNode<T> removeNode(TreeNode<T> root, T value) {
        if (root == null) {
            return null;
        }
        int result = value.compareTo(root.data);
        if (result < 0) {
            // Delete value in the left subtree
            root.left = removeNode(root.left, value);
        } else if (result > 0) {
            // Delete value in the right subtree
            root.right = removeNode(root.right, value);
        } else {
            // Delete root
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            TreeNode<T> inorderSuccessor = getSmallestNode(root.right);
            root.data = inorderSuccessor.data;

            root.right = removeNode(root.right, inorderSuccessor.data);
        }

        return root;
    }

    private TreeNode<T> getSmallestNode(TreeNode<T> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void printInorder() {
        TreeNode.inOrder(this.root);
        System.out.println();
    }
}
