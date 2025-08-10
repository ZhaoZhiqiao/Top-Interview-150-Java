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

    /**
     * 20. 有效的括号
     */
    public boolean isValid(String s) {
        Map<Character, Character> pair = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (pair.containsKey(c) && stack.peek() == pair.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    /**
     * 71. 简化路径
     */
    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();
        String[] parts = path.split("/+");
        StringBuilder new_path = new StringBuilder();
        for (String part : parts) {
            if (part.equals("..")) {
                if (deque.isEmpty()) continue;
                deque.pop();
            } else if (!part.equals(".") && !part.isEmpty()) {
                deque.push(part);
            }
        }
        if (deque.isEmpty()) {
            new_path.append("/");
        } else {
            int n = deque.size();
            for (int i = 0; i < n; i++) {
                new_path.append("/").append(deque.pollLast());
            }
        }
        return new_path.toString();
    }

    /**
     * 155. 最小栈
     */
    public static class MinStack {
        Deque<Integer> stack;
        PriorityQueue<Integer> minQueue;

        public MinStack() {
            stack = new ArrayDeque<>();
            minQueue = new PriorityQueue<>();
        }

        public void push(int val) {
            stack.push(val);
            minQueue.offer(val);
        }

        public void pop() {
            minQueue.remove(stack.peek());
            stack.pop();
        }

        public int top() {
            return stack.isEmpty() ? 0 : stack.peek();
        }

        public int getMin() {
            return minQueue.isEmpty() ? 0 : minQueue.peek();
        }
    }
}
