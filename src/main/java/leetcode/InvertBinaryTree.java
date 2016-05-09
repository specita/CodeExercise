package leetcode;

import leetcode.datastructure.TreeNode;

/**
 * Created by p.chen on 2016/4/21.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode temp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = temp;
        return root;
    }

}
