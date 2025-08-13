package org.example.solutions;

import org.example.datastructure.ListNode;
import org.example.datastructure.Node;

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

    /**
     * 150. 逆波兰表达式求值
     */
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.matches("[+\\-*/]")) {
                int b = stack.pop(), a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    /**
     * 224. 基本计算器
     */
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        int sign = 1, result = 0, n = s.length(), i = 0;
        while (i < n) {
            switch (s.charAt(i)) {
                case ' ':
                    i++;
                    break;
                case '+':
                    sign = stack.isEmpty() ? 1 : stack.peek();
                    i++;
                    break;
                case '-':
                    sign = stack.isEmpty() ? 1 : -stack.peek();
                    i++;
                    break;
                case '(':
                    stack.push(sign);
                    i++;
                    break;
                case ')':
                    stack.pop();
                    i++;
                    break;
                default:
                    int num = 0;
                    while (i < n && Character.isDigit(s.charAt(i))) {
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    result += (sign * num);
            }
        }
        return result;
    }

    /**
     * 141. 环形链表
     */
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        while (!visited.contains(head)) {
            if (head == null) {
                return false;
            }
            visited.add(head);
            head = head.next;
        }
        return true;
    }

    /**
     * 2. 两数相加
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean needCarry = false;
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + (needCarry ? 1 : 0);
            needCarry = sum >= 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + (needCarry ? 1 : 0);
            needCarry = sum >= 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + (needCarry ? 1 : 0);
            needCarry = sum >= 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l2 = l2.next;
        }
        if (needCarry) {
            current.next = new ListNode(1);
        }
        return dummyNode.next;
    }

    /**
     * 21. 合并两个有序链表
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0), current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }
        current.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

    /**
     * 138. 随机链表的复制
     */
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0), current = dummy, oldHead = head;
        while (head != null) {
            Node newNode = new Node(head.val);
            newNode.next = head.next;
            head.next = newNode;
            head = head.next.next;
        }

        head = oldHead;
        while (head != null) {
            Node newNode = head.next;
            newNode.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }

        while (oldHead != null) {
            Node newNode = oldHead.next;
            oldHead.next = oldHead.next.next;
            oldHead = oldHead.next;
            current.next = newNode;
            current = current.next;
        }

        return dummy.next;
    }

    /**
     * 92. 反转链表 II
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy, end;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        end = pre.next;
        for (int i = left; i < right; i++) {
            ListNode next = end.next;
            end.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummy.next;
    }

    /**
     * 25. K 个一组翻转链表
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cursor = head;
        int left = 1, right = k;
        boolean canFind = true;
        while (canFind) {
            for (int i = 0; i < k; i++) {
                if (cursor == null) {
                    canFind = false;
                    break;
                }
                cursor = cursor.next;
            }
            if (canFind) {
                head = reverseBetween(head, left, right);
                left += k;
                right += k;
            }
        }
        return head;
    }

    /**
     * 19. 删除链表的倒数第 N 个结点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy, fast = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    /**
     * 82. 删除排序链表中的重复元素 II
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0, head), cursor = dummy;
        while (cursor.next != null && cursor.next.next != null) {
            if (cursor.next.val == cursor.next.next.val) {
                int x = cursor.next.val;
                while (cursor.next != null && cursor.next.val == x) {
                    cursor.next = cursor.next.next;
                }
            } else {
                cursor = cursor.next;
            }

        }
        return dummy.next;
    }

    /**
     * 61. 旋转链表
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        ListNode dummy = new ListNode(0, head), slow = head, fast = head;
        int size = 0;
        while (k > 0 && fast != null) {
            fast = fast.next;
            size++;
            k--;
        }
        if (k > 0) {
            k = k % size;
            fast = head;
            while (k-- > 0) {
                fast = fast.next;
            }
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (fast != null && fast != slow) {
            dummy.next = slow.next;
            slow.next = null;
            fast.next = head;
        }
        return dummy.next;
    }

    /**
     * 86. 分隔链表
     */
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0, head), cursor = dummy, end, stop;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        end = cursor;
        stop = cursor;
        boolean first = true;

        cursor = dummy;
        while (cursor.next != null && cursor.next != stop) {
            if (cursor.next.val >= x) {
                if (first) {
                    stop = cursor.next;
                    first = false;
                }
                end.next = cursor.next;
                cursor.next = cursor.next.next;
                end = end.next;
                end.next = null;
            } else {
                cursor = cursor.next;
            }
        }
        return dummy.next;
    }
}
