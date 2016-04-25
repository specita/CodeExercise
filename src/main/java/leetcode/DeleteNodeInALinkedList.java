package leetcode;

/**
 * Created by p.chen on 2016/4/11.
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * <p>
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list
 * should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInALinkedList {

    /**
     * 题目没看懂啊。。理解错了，翻译了一下题目：写一个函数删除指定的点，只给出要删除的这个结点，就是说参数表示要删除的结点
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
