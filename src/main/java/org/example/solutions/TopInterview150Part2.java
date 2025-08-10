package org.example.solutions;

import java.util.*;


/**
 * Top Interview 150 - 第二个50题 (51-100题)
 * 该类包含 Top Interview 150 列表中51-100题的解决方案。
 */
@SuppressWarnings({"unused", "Duplicates"})
public class TopInterview150Part2 {
    /**
     * 452. 用最少数量的箭引爆气球
     */
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        HashSet<int[]> intervals = new HashSet<>();
        for (int[] point : points) {
            boolean hasIntersection = false;
            for (int[] interval : intervals) {
                if (Math.min(interval[1], point[1]) >= Math.max(interval[0], point[0])) {
                    hasIntersection = true;
                    intervals.add(new int[]{Math.max(interval[0], point[0]), Math.min(interval[1], point[1])});
                    intervals.remove(interval);
                    break;
                }
            }
            if (!hasIntersection) {
                intervals.add(point);
            }
        }
        return intervals.size();
    }
}
