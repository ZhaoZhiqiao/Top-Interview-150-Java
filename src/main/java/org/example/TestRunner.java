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
//        testMerge(solution);
//        testRemoveElement(solution);
//        testRemoveDuplicates(solution);
//        testRemoveDuplicates2(solution);
//        testMajorityElement(solution);
//        testRotate(solution);
//        testMaxProfit(solution);
//        testMaxProfit2(solution);
        testCanJump(solution);
        // 🔼 只保留您想测试的题目，注释掉其他的
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

    /**
     * 测试 27. 移除元素
     */
    private static void testRemoveElement(TopInterview150Part1 solution) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = solution.removeElement(nums, val);
        SimpleTest.testReturn("27. 移除元素", result, nums, val);
    }

    /**
     * 测试 26. 删除有序数组中的重复项
     */
    private static void testRemoveDuplicates(TopInterview150Part1 solution) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(nums);
        SimpleTest.testReturnWithArray("26. 删除有序数组中的重复项", result, nums);
    }

    /**
     * 测试 80. 删除有序数组中的重复项 II
     */
    private static void testRemoveDuplicates2(TopInterview150Part1 solution) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int result = solution.removeDuplicates2(nums);
        SimpleTest.testReturnWithArray("80. 删除有序数组中的重复项 II", result, nums);
    }


    /**
     * 测试 169. 多数元素
     */
    private static void testMajorityElement(TopInterview150Part1 solution) {
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        SimpleTest.testReturnWithArray("169. 多数元素", result, nums);
    }

    /**
     * 测试 189. 轮转数组
     */
    private static void testRotate(TopInterview150Part1 solution) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] original = SimpleTest.copy(nums);
        solution.rotate(nums, k);
        SimpleTest.testInPlace("189. 轮转数组", original, nums, k);
    }

    /**
     * 测试 121. 买卖股票的最佳时机
     */
    private static void testMaxProfit(TopInterview150Part1 solution) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(nums);
        SimpleTest.testReturnWithArray("121. 买卖股票的最佳时机", result, nums);
    }

    /**
     * 测试 122. 买卖股票的最佳时机 II
     */
    private static void testMaxProfit2(TopInterview150Part1 solution) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit2(nums);
        SimpleTest.testReturnWithArray("122. 买卖股票的最佳时机 II", result, nums);
    }

    /**
     * 55. 跳跃游戏
     */
    private static void testCanJump(TopInterview150Part1 solution) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = solution.canJump(nums);
        SimpleTest.testReturnWithArray("55. 跳跃游戏", result, nums);
    }
}
