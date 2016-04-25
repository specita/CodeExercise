package leetcode;

/**
 * Created by p.chen on 2016/4/6.
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class AddDigits {
    /**
     * 参考https://en.wikipedia.org/wiki/Digital_root
     * 公式
     * For base b (decimal case b = 10), the digit root of an integer is:
     * <p>
     * dr(n) = 0 if n == 0
     * dr(n) = (b-1) if n != 0 and n % (b-1) == 0
     * dr(n) = n mod (b-1) if n % (b-1) != 0
     * or
     * <p>
     * dr(n) = 1 + (n - 1) % 9
     * 看提示所有可能的数值组合，想到了只能是0-9，然后试着用%9去测试几个数，发现可行。。并不懂原理。。
     * https://en.wikipedia.org/wiki/Digital_root
     * 12,345 = 1 × (9,999 + 1) + 2 × (999 + 1) + 3 × (99 + 1) + 4 × (9 + 1) + 5.
     * 12,345 = (1 × 9,999 + 2 × 999 + 3 × 99 + 4 × 9) + (1 + 2 + 3 + 4 + 5).
     * @param num
     * @return
     */
    public int addDigits(int num) {
        //dr(n) = 1 + (n - 1) % 9
        return 1 + (num - 1) % 9;
    }
}
