public class BSTMain {

    class Node {
        int data;
        Node left;
        Node right;
    }

    public class BinarySearchTree {
        // Insert Method
        public Node insert(Node root, int val) {
            if (root == null) {
                return craeteNewNode(val);
            }
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else if (val > root.data) {
                root.right = insert(root.right, val);
            }
            return root;
        }

        // New Node Creation Method
        public Node craeteNewNode(int temp) {
            Node bst = new Node();
            bst.data = temp;
            bst.left = null;
            bst.right = null;
            return bst;
        }

        public void print(Node root) { // print method
            if (root == null) {
                return;
            }
            print(root.left);
            System.out.println(root.data);
            print(root.right);
        }

        // Search Node in given BST
        public boolean nodePresent(Node root, int val) {
            if (root == null) {
                return false;
            }
            Boolean isPresent = false;

            while (root != null) {
                if (val < root.data) {
                    root = root.left;
                } else if (val > root.data) {
                    root = root.right;
                } else {
                    isPresent = true;
                    break;
                }

            }
            return isPresent;
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree...!!!");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);
        System.out.println(bst.nodePresent(root, 63));
    }
}
