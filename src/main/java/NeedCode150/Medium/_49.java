package NeedCode150.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class _49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();
        List<String> inner = new ArrayList<>();
        outer.add(inner);

        if (strs.length == 0) {
            inner.add(""); return outer;
        }
        if (strs.length == 1){
            inner.add(strs[0]); return outer;
        }

        Map<String, List<String>> table = new HashMap<>();
        for (String a: strs) {
            String b = Arrays.stream(a.split("")).sorted().collect(Collectors.joining());
            if (!table.containsKey(b)) {
                table.put(b, new ArrayList<>());
            }
            table.get(b).add(a);
        }

        int len = table.size();
        int index = 0;
        for (String a : table.keySet()) {
            outer.get(index++).addAll(table.get(a));
            if (index >= len) break;
            outer.add(new ArrayList<>());
        }
        return outer;
    }
}

// Thoughts on Problem GroupAnagrams
// the Description doesnt mention that every string is the same length
// the solution is based on that
