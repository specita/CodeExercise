package leetcode;

import leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by p.chen on 2016/5/12.
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example:
 * Given binary tree {1,#,2,3},return [1,2,3].
 */
public class BinaryTreePreorderTraversal {
    /**
     * 前序遍历，递归解决
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));

        return result;
    }

    /**
     * Note: Recursive solution is trivial, could you do it iteratively?
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalV2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        //队列是广度遍历
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            queue.add(root.left);
            result.add(node.val);
        }
    }


}
