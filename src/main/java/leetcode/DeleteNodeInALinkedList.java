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
     * ��Ŀû���������������ˣ�������һ����Ŀ��дһ������ɾ��ָ���ĵ㣬ֻ����Ҫɾ���������㣬����˵������ʾҪɾ���Ľ��
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
