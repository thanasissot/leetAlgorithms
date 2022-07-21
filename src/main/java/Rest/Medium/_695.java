package Rest.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class _695 {
    // 34 + 25 + 8 minutes
    public static int maxAreaOfIsland(int[][] grid) {
        // store points and map it to an int
        HashMap<Point, Integer> map = new HashMap<>();
        int check = 0;
        int island = 0;
        Point point = null;
        // i = ROWS
        // j = COL
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    point = new Point(i, j);
                    List<Integer> list = findPoint(point, grid, map);
                    if (list.size() == 0) {
                        island++;
                        map.put(point, island);
                    }
                    else if (list.size() == 1) {
                        // insert point that belongs to another island
                        map.put(point, list.get(0));
                    }

                    else if (list.size() == 2){
                        // connect islands and insert point to new bigger island
                        handleIslands(point, list, map);
                    }
                }
            }
        }

        // sum island points and return max
        int[] arr = new int[island + 1];
        for (int value : map.values()) arr[value]++;
        int max = 0;
        for (int j : arr) {
            if (j > max) max = j;
        }

        return max;

    }

    // insert logic to concat islands with different int but same neighbors
    // finding all the common neighbors which dont have same island and changing their int
    static void handleIslands(Point point, List<Integer> list, HashMap<Point, Integer> map) {
        Collections.sort(list);

        for (Point p : map.keySet()) {
            if (map.get(p) == list.get(1)) {
                map.put(p, list.get(0));
            }
        }
        map.put(point, list.get(0));
    }

    static List<Integer> findPoint(Point a, int[][] grid, HashMap<Point, Integer> map) {
        Point b;
        List<Integer> list = new ArrayList<>();
        if (a.x > 0) {
            b = new Point(a.x - 1, a.y);
            if (map.containsKey(b)) list.add(map.get(b));
        }
        if (a.y > 0) {
            b = new Point(a.x, a.y - 1);
            if (map.containsKey(b)) list.add(map.get(b));
        }

        return list;
    }


    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj){
            Point p = (Point) obj;
            return p.x == this.x && p.y == this.y;
        }
    }


    public static int maxAreaOfIsland2(int[][] grid){
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    int t = islandArea(grid, i, j);
                    if (sum < t) sum = t;
                }
            }
        }
        return sum;
    }

    public static int islandArea(int[][] grid, int x, int y){
        int sum = 1;
        List<Point> list = new ArrayList<>();
        list.add(new Point(x, y));

        while (!list.isEmpty()) {
            Point p = list.remove(0);
            sum += check(p, grid, list);
        }
        return sum;

    }

    public static int check(Point p, int[][] grid, List<Point> list){
        int total = 0;
        if (p.x > 0 && grid[p.x - 1][p.y] == 1) {
            list.add(new Point(p.x - 1, p.y));
            grid[p.x - 1][p.y] = 0;
            total++;
        }
        if (p.x < grid.length - 1 && grid[p.x + 1][p.y] == 1) {
            list.add(new Point(p.x + 1, p.y));
            grid[p.x + 1][p.y] = 0;
            total++;
        }
        if (p.y > 0 && grid[p.x][p.y - 1] == 1) {
            list.add(new Point(p.x, p.y - 1));
            grid[p.x][p.y - 1] = 0;
            total++;
        }
        if (p.y < grid[0].length - 1 && grid[p.x][p.y + 1] == 1) {
            list.add(new Point(p.x, p.y + 1));
            grid[p.x][p.y + 1] = 0;
            total++;
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{
                new int[]{0,0,1,0,0,0,0,1,0,0,0,0,0},
                new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
                new int[]{0,1,1,0,1,0,0,0,0,0,0,0,0},
                new int[]{0,1,0,0,1,1,0,0,1,0,1,0,0},
                new int[]{0,1,0,0,1,1,0,0,1,1,1,0,0},
                new int[]{0,0,0,0,0,0,0,0,0,0,1,0,0},
                new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
                new int[]{0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println(maxAreaOfIsland(a));
    }
}
