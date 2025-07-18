package org.example.solutions;

/**
 * Top Interview 150 - 前50题
 * 该类包含 Top Interview 150 列表中前50题的解决方案。
 */
@SuppressWarnings({"unused", "Duplicates"})
public class TopInterview150Part1 {
    /**
     * 88. 合并两个有序数组
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= 0 && m > 0 && n > 0; i--) {
            nums1[i] = nums1[m - 1] > nums2[n - 1] ? nums1[--m] : nums2[--n];

        }
        while (m - 1 >= 0) nums1[m - 1] = nums1[--m];
        while (n - 1 >= 0) nums1[n - 1] = nums2[--n];
    }

    /**
     * 27. 移除元素
     */
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                count++;
                continue;
            }
            nums[i - count] = nums[i];
        }
        return length - count;
    }

    /**
     * 26. 删除有序数组中的重复项
     */
    public int removeDuplicates(int[] nums) {
        int size = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[size]) {
                nums[++size] = nums[i];
            }
        }
        return size + 1;
    }

    /**
     * 80. 删除有序数组中的重复项 II
     */
    public int removeDuplicates2(int[] nums) {
        int size = 0;
        for (int i = 1; i < nums.length; i++) {
            if (size < 1 || nums[i] > nums[size - 1]) {
                nums[++size] = nums[i];
            }
        }
        return size + 1;
    }

    /**
     * 169. 多数元素
     */
    public int majorityElement(int[] nums) {
        int count = 0, element = 0;
        for (int x : nums) {
            if (count == 0) {
                element = x;
            }
            count += (x == element) ? 1 : -1;
        }
        return element;
    }

    /**
     * 189. 轮转数组
     */
    public void rotate(int[] nums, int k) {
        int count = gcd(nums.length, k);
        for (int i = 0; i < count; i++) {
            int before = nums[i], index = i, temp;
            while (true) {
                int nextIndex = (index + k) % nums.length;
                if (nextIndex == i) break;
                temp = nums[nextIndex];
                nums[nextIndex] = before;
                before = temp;
                index = nextIndex;
            }
            nums[i] = before;
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * 121. 买卖股票的最佳时机
     */
    public int maxProfit(int[] prices) {
        int profit = 0, minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                profit = Math.max(profit, price - minPrice);
            }
        }
        return profit;
    }

    /**
     * 122. 买卖股票的最佳时机 II
     */
    public int maxProfit2(int[] prices) {
        int lowPrice = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            if (price < lowPrice) {
                lowPrice = price;
            } else if (price > lowPrice) {
                profit += price - lowPrice;
                lowPrice = price; // 更新低价为当前价格
            }
        }
        return profit;
    }

    /**
     * 55. 跳跃游戏
     */
    public boolean canJump(int[] nums) {
        int maxDis = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxDis) return false;
            maxDis = Math.max(maxDis, i + nums[i]);
        }
        return true;
    }

    /**
     * 测试 45. 跳跃游戏 II
     */
    public int jump(int[] nums) {
        int maxDis = 0;
        int end = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxDis = Math.max(maxDis, i + nums[i]);
            if (i == end) {
                steps++;
                end = maxDis;
            }
        }
        return steps;
    }
}