package test.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LC1TwoSumTest {

    @Test
    void twoSum() {
        LC1TwoSum ts = new LC1TwoSum();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] finalResult = new int[]{0,1};
        int[] result = ts.twoSum(nums, target);
        assertArrayEquals(finalResult, result);
    }
}