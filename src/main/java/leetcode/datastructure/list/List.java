package leetcode.datastructure.list;

/**
 * Created by p.chen on 2016/4/18.
 */
public interface List<T> {
    T search(T element);

    void insert(T element);

    void remove(T element);
}
