package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode
 * 2023/5/25  17:59
 *
 * @author: Alex
 * @version: 1.0
 */
public class No448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], count);
        }
        for (int i = 1; i < nums.length; i++) {
            if (map.getOrDefault(i, 0) == 0) {
                ret.add(i);
            }
        }

        return ret;
    }
}
