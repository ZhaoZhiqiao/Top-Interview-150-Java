package org.example;

import org.example.solutions.TopInterview150Part1;
import org.example.utils.SimpleTest;

/**
 * 简单测试运行器 - 一次测试一个题目
 * 使用方法：
 * 1. 注释掉不需要的测试
 * 2. 只保留您想测试的那一个
 * 3. 运行这个类查看结果
 */
@SuppressWarnings("unused")
public class TestRunner {

    public static void main(String[] args) {
        TopInterview150Part1 solution = new TopInterview150Part1();

        // 🔽 只保留您想测试的题目，注释掉其他的
        testMerge(solution);
    }

    /**
     * 测试 88. 合并两个有序数组
     */
    private static void testMerge(TopInterview150Part1 solution) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] original = SimpleTest.copy(nums1);
        solution.merge(nums1, 3, nums2, 3);
        SimpleTest.testInPlace("88. 合并两个有序数组", original, nums1);
    }
}
