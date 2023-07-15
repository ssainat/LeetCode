import java.util.*;

public class LC217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> storeInt = new HashSet<>();
        for(int num : nums) {
            if (!storeInt.contains(num)) {
                storeInt.add(num);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
