package leetcode;

/**
 * Created by p.chen on 2016/4/21.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root.left == null || root.right == null) {
            return root;
        }


        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
