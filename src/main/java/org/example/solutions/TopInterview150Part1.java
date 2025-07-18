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

}
