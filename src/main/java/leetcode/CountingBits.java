package leetcode;

/**
 * Created by p.chen on 2016/4/6.
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * 用一个数组表示0-num中每个数的二进制表示中的1的个数，用o(n)的时间复杂度
 */
public class CountingBits {
    /**
     * 我的解法，考虑到2^n都为1..和bets vote比起来，并没有真正理解到除和模的概念
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = 0;
                continue;
            }

            //判断 是否为2^n的数，
            if ((i & (i - 1)) == 0) {
                result[i] = 1;
                k = i;
                continue;
            }

            result[i] = result[i - k] + 1;
        }
        return result;
    }

    /**
     * best vote
     * f[i] = f[i / 2] + i % 2.
     *
     * @param num
     * @return
     */
    public int[] countBitsBest(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }
}
