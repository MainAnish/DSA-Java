
import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class binaryTree {

    static Scanner sc = new Scanner(System.in);

    // 1. Create tree using user input
    static Node createTree() {
        System.out.print("Enter value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = createTree();

        System.out.println("Enter right child of " + value);
        root.right = createTree();

        return root;
    }

    // 2. Preorder
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // 3. Inorder
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 4. Postorder
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // 5. Level order
    static void levelOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
    }

    // 6. Count nodes
    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // 7. Count leaves
    static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }

    // 8. Height (measured in edges)
    static int height(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // 9. Maximum value
    static int maxValue(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Empty tree");
        }
        int max = root.data;
        if (root.left != null) {
            max = Math.max(max, maxValue(root.left));
        }
        if (root.right != null) {
            max = Math.max(max, maxValue(root.right));
        }
        return max;
    }

    // 10. Minimum value
    static int minValue(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Empty tree");
        }
        int min = root.data;
        if (root.left != null) {
            min = Math.min(min, minValue(root.left));
        }
        if (root.right != null) {
            min = Math.min(min, minValue(root.right));
        }
        return min;
    }

    // 11. Search
    static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        return search(root.left, target) || search(root.right, target);
    }

    // 12. Count internal nodes
    static int countInternalNodes(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + countInternalNodes(root.left)
                + countInternalNodes(root.right);
    }

    // 13. Sum nodes
    static long sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumNodes(root.left) + sumNodes(root.right);
    }

    // 14. Mirror tree
    static Node mirrorTree(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    // 15. Compare two trees
    static boolean isIdentical(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }

        return a.data == b.data
                && isIdentical(a.left, b.left)
                && isIdentical(a.right, b.right);
    }

    public static void main(String[] args) {
        System.out.println("Create the binary tree:");
        Node root = createTree();

        while (true) {
            System.out.println("\n\n--- MENU ---");
            System.out.println("1. Create a new tree");
            System.out.println("2. Preorder");
            System.out.println("3. Inorder");
            System.out.println("4. Postorder");
            System.out.println("5. Level order");
            System.out.println("6. Count nodes");
            System.out.println("7. Count leaves");
            System.out.println("8. Height");
            System.out.println("9. Maximum value");
            System.out.println("10. Minimum value");
            System.out.println("11. Search");
            System.out.println("12. Count internal nodes");
            System.out.println("13. Sum nodes");
            System.out.println("14. Mirror tree");
            System.out.println("15. Compare with another tree");
            System.out.println("16. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    root = createTree();
                    break;
                case 2:
                    preorder(root);
                    System.out.println();
                    break;
                case 3:
                    inorder(root);
                    System.out.println();
                    break;
                case 4:
                    postorder(root);
                    System.out.println();
                    break;
                case 5:
                    levelOrder(root);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Total nodes: " + countNodes(root));
                    break;
                case 7:
                    System.out.println("Leaf nodes: " + countLeaves(root));
                    break;
                case 8:
                    System.out.println("Height: " + height(root));
                    break;
                case 9:
                    if (root == null) {
                        System.out.println("Tree is empty"); 
                    }else {
                        System.out.println("Maximum: " + maxValue(root));
                    }
                    break;
                case 10:
                    if (root == null) {
                        System.out.println("Tree is empty"); 
                    }else {
                        System.out.println("Minimum: " + minValue(root));
                    }
                    break;
                case 11:
                    System.out.print("Enter value to search: ");
                    int target = sc.nextInt();
                    System.out.println(search(root, target) ? "Found" : "Not found");
                    break;
                case 12:
                    System.out.println("Internal nodes: " + countInternalNodes(root));
                    break;
                case 13:
                    System.out.println("Sum: " + sumNodes(root));
                    break;
                case 14:
                    root = mirrorTree(root);
                    System.out.println("Tree mirrored");
                    break;
                case 15:
                    System.out.println("Create the second tree:");
                    Node second = createTree();
                    System.out.println(isIdentical(root, second)
                            ? "Trees are identical"
                            : "Trees are not identical");
                    break;
                case 16:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
