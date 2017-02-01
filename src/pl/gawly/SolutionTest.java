package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertTrue(Arrays.equals(new int[]{}, s.solution(new int[]{})));
    }

    @Test
    public void testOne() {
        Assert.assertTrue(Arrays.equals(new int[]{0}, s.solution(new int[]{1})));
    }

    @Test
    public void testExample1() {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 3;
        A[4] = 6;

        int[] result = new int[]{2, 4, 3, 2, 0};
        Assert.assertTrue(Arrays.equals(result, s.solution(A)));
    }
}
