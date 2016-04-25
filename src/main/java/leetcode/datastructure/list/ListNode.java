package leetcode.datastructure.list;

/**
 * Created by p.chen on 2016/4/18.
 */
public class ListNode<T> {
    public ListNode<T> next;
    public T value;

    public ListNode() {
    }

    public ListNode(T value) {
        this.value = value;
    }

    public ListNode(ListNode<T> next, T value) {
        this.next = next;
        this.value = value;
    }
}
