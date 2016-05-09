package leetcode;

import leetcode.datastructure.TreeNode;

/**
 * Created by p.chen on 2016/5/4.
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    /**
     * traversal two trees use two check the result
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }


        return isSameTree(p.left, q.left)?isSameTree(p.right, q.right):false;
    }

}
