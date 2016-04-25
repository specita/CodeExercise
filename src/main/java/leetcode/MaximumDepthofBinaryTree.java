package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by p.chen on 2016/4/6.
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {
    /**
     * 简单的递归算法啊！！！！我真是笨得可以，一开始就想自己搞个stack出来做，递归利用了jvm的stack
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        return depthLeft > depthRight ? depthLeft + 1 : depthRight + 1;
    }

    /**
     * 用loop实现的，这个我一开始是这么想的，但是没有实现出来，主要在于用stack.size来控制第二个while没有想到，而且我一直想用stack而不是queue
     * 需要好好复习一下树的知识了
     * @param root
     * @return
     */
    public int maxDepthLoop(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int count = 0;

        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size-- > 0) {
                TreeNode cur = stack.pop();
                if (cur.left != null) {
                    stack.addLast(cur.left);
                }
                if (cur.right != null) {
                    stack.addLast(cur.right);
                }
            }
            count++;
        }
        return count;
    }


    private class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}


