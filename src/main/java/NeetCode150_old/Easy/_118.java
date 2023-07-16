package NeetCode150_old.Easy;

import java.util.ArrayList;
import java.util.List;

public class _118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            outer.add(new ArrayList<>());
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    outer.get(i).add(1);
                    continue;
                }

                outer.get(i).add(
                        outer.get(i - 1).get(j - 1) + outer.get(i - 1).get(j)
                );
            }
        }
        outer.remove(0);
        return outer;

    }

}
