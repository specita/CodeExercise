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
     * �򵥵ĵݹ��㷨���������������Ǳ��ÿ��ԣ�һ��ʼ�����Լ����stack���������ݹ�������jvm��stack
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
     * ��loopʵ�ֵģ������һ��ʼ����ô��ģ�����û��ʵ�ֳ�������Ҫ������stack.size�����Ƶڶ���whileû���뵽��������һֱ����stack������queue
     * ��Ҫ�úø�ϰһ������֪ʶ��
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


