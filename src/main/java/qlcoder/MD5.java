package qlcoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * Created by p.chen on 2016/4/22.
 */
public class MD5 {

    /**
     * 已经一个用户的md5密码，然后知道用户习惯用8生日作为密码，找到这个密码
     * @param args
     * @throws NoSuchAlgorithmException
     * @throws ParseException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String code = "7E38890B870934B126F66857ED6B57B9";
        byte[] codeBytes = new byte[16];
        int i = 0;
        int j = 0;

        while (j < codeBytes.length){
            codeBytes[j++] = (byte)Integer.parseInt(code.substring(i, i + 2), 16);
            i = i+2;
        }


        LocalDate end = LocalDate.now();
        System.out.println(Arrays.toString(codeBytes));
        for (LocalDate date = LocalDate.of(1990, 1,1); date.isBefore(end);date = date.plusDays(1)){
            String dateStr = date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            md5.update(dateStr.getBytes());
            byte[] bytes = md5.digest();
            if(Arrays.equals(bytes, codeBytes)){
                System.out.println("correct :" + dateStr);
                return;
            }
        }
    }
}
