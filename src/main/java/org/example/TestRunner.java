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
//        testCanJump(solution);
//        testJump(solution);
//        testHIndex(solution);
//        testRandomizedSet(solution);
//        testProductExceptSelf(solution);
//        testCanCompleteCircuit(solution);
        testCandy(solution);
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
     * 测试 55. 跳跃游戏
     */
    private static void testCanJump(TopInterview150Part1 solution) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = solution.canJump(nums);
        SimpleTest.testReturnWithArray("55. 跳跃游戏", result, nums);
    }

    /**
     * 测试 45. 跳跃游戏 II
     */
    private static void testJump(TopInterview150Part1 solution) {
        int[] nums = {2, 3, 1, 1, 4};
        int result = solution.jump(nums);
        SimpleTest.testReturnWithArray("45. 跳跃游戏 II", result, nums);
    }

    /**
     * 测试 274. H 指数
     */
    private static void testHIndex(TopInterview150Part1 solution) {
        int[] nums = {3, 0, 6, 1, 5};
        int result = solution.hIndex(nums);
        SimpleTest.testReturnWithArray("274. H 指数", result, nums);
    }

    /**
     * 测试 380. O(1) 时间插入、删除和获取随机元素
     */
    private static void testRandomizedSet(TopInterview150Part1 solution) {
        TopInterview150Part1.RandomizedSet randomizedSet = solution.new RandomizedSet();
        boolean step1 = randomizedSet.insert(1); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        boolean step2 = randomizedSet.remove(2); // 返回 false ，表示集合中不存在 2。
        boolean step3 = randomizedSet.insert(2); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2]。
        int step4 = randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2。
        boolean step5 = randomizedSet.remove(1); // 从集合中移除 1 ，返回 true 。集合现在包含 [2]。
        boolean step6 = randomizedSet.insert(2); // 2 已在集合中，所以返回 false。
        int step7 = randomizedSet.getRandom(); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2。
        boolean result = step1 && !step2 && step3 && (step4 == 1 || step4 == 2) && step5 && !step6 && step7 == 2;
        SimpleTest.testReturn("380. O(1) 时间插入、删除和获取随机元素", result);
    }

    /**
     * 测试 238. 除自身以外数组的乘积
     */
    private static void testProductExceptSelf(TopInterview150Part1 solution) {
        int[] nums = {1, 2, 3, 4};
        int[] original = SimpleTest.copy(nums);
        int[] result = solution.productExceptSelf(nums);
        SimpleTest.testInPlace("238. 除自身以外数组的乘积", original, result);
    }

    /**
     * 测试 134. 加油站
     */
    private static void testCanCompleteCircuit(TopInterview150Part1 solution) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = solution.canCompleteCircuit(gas, cost);
        SimpleTest.testReturnWithArrays("134. 加油站", result, gas, cost);
    }


    /**
     * 测试 135. 分发糖果
     */
    private static void testCandy(TopInterview150Part1 solution) {
        int[] ratings = {1, 2, 2};
        int result = solution.candy(ratings);
        SimpleTest.testReturn("135. 分发糖果", result);
    }

}
