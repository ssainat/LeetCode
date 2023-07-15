import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC217ContainsDuplicateTest {
    @Test
    void containsDuplicate() {

        LC217ContainsDuplicate cd = new LC217ContainsDuplicate();
        int[] nums = new int[]{0, 0};
        assertTrue(cd.containsDuplicate(nums));
    }
}