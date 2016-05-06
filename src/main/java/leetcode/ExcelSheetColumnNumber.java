package leetcode;

/**
 * Created by p.chen on 2016/5/6.
 * Related to question Excel Sheet Column Title
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * FOR EXAMPLE:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class ExcelSheetColumnNumber {

    /**
     * 这相当于是一个26进制的数,可以对比16进制转10进制的方法
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int i = -1;
        double result = 0.0d;
        while (++i < chars.length){
            result += (chars[i] - 'A' + 1) * Math.pow(26, chars.length - 1 - i);
        }

        return (int)result;

    }
}
