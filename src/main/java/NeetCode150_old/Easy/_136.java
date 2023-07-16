package NeetCode150_old.Easy;

import java.util.HashMap;
import java.util.Map;

public class _136 {
    // Brute force solution
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        int ret = Integer.MIN_VALUE;
        for (int a : map.keySet()) {
            if (map.get(a) == 1) {
                ret = a;
                break;                
            }
        }
        
        return ret;
    }
}
