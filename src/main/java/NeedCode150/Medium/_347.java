package NeedCode150.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class _347 {
    // my brute force solution -> nlong + extra space 3n
    public static int[] topKFrequent(int[] nums, int k) {
        // n
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        // + n
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int a : map.keySet()) {
            list.add(map.get(a));
            if(!map2.containsKey(map.get(a))){
                map2.put(map.get(a), new ArrayList<>());
            }
            map2.get(map.get(a)).add(a);
        }
        // reverse list + nlogn
        list.sort(Collections.reverseOrder());

        int[] res = new int[k];
        for(int i = 0; i  < k;) {
            List<Integer> clist = map2.get(list.get(i));
            for (int j = 0; j < clist.size(); j++, i++) {
                res[i] = clist.get(j);
            }
        }
        return res;
    }

    // O(n) Big O - what happens is you omit the sorting of a list which is O(nlogn)
    // the trick is using an array but the length of it can only be nums.length
    public static int[] topKFrequent1(int[] nums, int k) {
        // n
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        ArrayList[] arr = new ArrayList[nums.length + 1];
        // traverse the map and add each element to the ArrayList[] index according to number of appearances
        for (int a : map.keySet()) {
            if(arr[map.get(a)] == null) {
                arr[map.get(a)] = new ArrayList<Integer>();
            }
            arr[map.get(a)].add(a);
        }

        int[] result = new int[k];
        int counter = 0;
        for (int i = arr.length-1; i >= 0 && counter < k; i--) {
            if (arr[i] == null) continue;
            else {
                for (int j = 0; j < arr[i].size(); j++){
                    result[counter++] = (int) arr[i].get(j);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        System.out.println(topKFrequent(nums, 2));
    }
}
