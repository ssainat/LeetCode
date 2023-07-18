import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LC242ValidAnagramTest {

    @Test
    void isAnagram() {
        LC242ValidAnagram va = new LC242ValidAnagram();
        assertTrue(va.isAnagram("rat", "tar"));
    }
}