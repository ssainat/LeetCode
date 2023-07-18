import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LC49GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        LC49GroupAnagrams ga = new LC49GroupAnagrams();
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output = Arrays.asList(Arrays.asList("eat, tea, ate"),
                Arrays.asList("tan, nat"),
                Arrays.asList("bat"));
        assertArrayEquals(output.toArray(), ga.groupAnagrams(strs).toArray());
    }
}