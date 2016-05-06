package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by p.chen on 2016/5/6.
 */
public class MajorityElementTest {
    @Test
    public void testMajorityElementV2() throws Exception {
        int[] num = new int[]{4,3,1,3,1,1,5,1};
        Assert.assertEquals(new MajorityElement().majorityElementV2(num), 1);
    }
}