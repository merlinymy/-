package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateCompleteBinaryTree {
    public boolean validateCompleteBinaryTree(TreeNode root) {
        if (root == null) return true;
        boolean isNull = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                if (!isNull) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else {
                    return false;
                }
            } else {
                isNull = true;
            }
        }
        return true;
    }
    public boolean validateCompleteBinaryTree2 (TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isNull = false;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                if (isNull) return false;
                queue.offer(cur.left);
            } else {
                isNull = true;
            }
            if (cur.right != null) {
                if (isNull) return false;
                queue.offer(cur.right);
            } else {
                isNull = true;
            }
        }
        return true;
    }
    public void validateCompleteBinaryTree3 (TreeNode root) {
        //Math
        return;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        //root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        ValidateCompleteBinaryTree test = new ValidateCompleteBinaryTree();
        System.out.println(test.validateCompleteBinaryTree2(root));
    }
}
