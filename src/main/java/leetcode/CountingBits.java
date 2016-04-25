package leetcode;

/**
 * Created by p.chen on 2016/4/6.
 * Given a non negative integer number num. For every numbers i in the range 0 �� i �� num calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * ��һ�������ʾ0-num��ÿ�����Ķ����Ʊ�ʾ�е�1�ĸ�������o(n)��ʱ�临�Ӷ�
 */
public class CountingBits {
    /**
     * �ҵĽⷨ�����ǵ�2^n��Ϊ1..��bets vote����������û��������⵽����ģ�ĸ���
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

            //�ж� �Ƿ�Ϊ2^n������
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
