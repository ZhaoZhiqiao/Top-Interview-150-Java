package org.example;

import org.example.solutions.TopInterview150Part1;
import org.example.solutions.TopInterview150Part2;
import org.example.utils.SimpleTest;

import java.util.List;

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
        TopInterview150Part1 solution1 = new TopInterview150Part1();
        TopInterview150Part2 solution2 = new TopInterview150Part2();
        // 🔽 只保留您想测试的题目，注释掉其他的
//        testMerge(solution1);
//        testRemoveElement(solution1);
//        testRemoveDuplicates(solution1);
//        testRemoveDuplicates2(solution1);
//        testMajorityElement(solution1);
//        testRotate(solution1);
//        testMaxProfit(solution1);
//        testMaxProfit2(solution1);
//        testCanJump(solution1);
//        testJump(solution1);
//        testHIndex(solution1);
//        testRandomizedSet(solution1);
//        testProductExceptSelf(solution1);
//        testCanCompleteCircuit(solution1);
//        testCandy(solution1);
//        testTrap(solution1);
//        testRomanToInt(solution1);
//        testTntToRoman(solution1);
//        testLengthOfLastWord(solution1);
//        testLongestCommonPrefix(solution1);
//        testReverseWords(solution1);
//        testConvert(solution1);
//        testStrStr(solution1);
//        testFullJustify(solution1);
//        testIsPalindrome(solution1);
//        testIsSubsequence(solution1);
//        testTwoSum2(solution1);
//        testMaxArea(solution1);
//        testThreeSum(solution1);
//        testMinSubArrayLen(solution1);
//        testLengthOfLongestSubstring(solution1);
//        testFindSubstring(solution1);
//        testMinWindow(solution1);
//        testIsValidSudoku(solution1);
//        testSpiralOrder(solution1);
//        testRotateImage(solution1);
//        testSetZeroes(solution1);
//        testGameOfLife(solution1);
//        testCanConstruct(solution1);
//        testIsomorphicStrings(solution1);
//        testWordPattern(solution1);
//        testValidAnagram(solution1);
//        testGroupAnagrams(solution1);
//        testTwoSum1(solution1);
//        testIsHappy(solution1);
//        testContainsNearbyDuplicate(solution1);
//        testLongestConsecutive(solution1);
//        testSummaryRanges(solution1);
//        testMergeIntervals(solution1);
//        testInsertIntervals(solution1);
//        testFindMinArrowShots(solution2);
//        testIsValid(solution2);
//        testSimplifyPath(solution2);
//        testMinStack(solution2);
        testEvalRPN(solution2);
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
        SimpleTest.testReturnWithArray("135. 分发糖果", result, ratings);
    }

    /**
     * 测试 42.  接雨水
     */
    private static void testTrap(TopInterview150Part1 solution) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = solution.trap(height);
        SimpleTest.testReturnWithArray("135. 接雨水", result, height);
    }

    /**
     * 测试 13. 罗马数字转整数
     */
    private static void testRomanToInt(TopInterview150Part1 solution) {
        String romanNumber = "III";
        int result = solution.romanToInt(romanNumber);
        SimpleTest.testReturn("13. 罗马数字转整数", result, romanNumber);
    }

    /**
     * 测试 12. 整数转罗马数字
     */
    private static void testTntToRoman(TopInterview150Part1 solution) {
        int num = 1994;
        String result = solution.intToRoman(num);
        SimpleTest.testReturn("12. 整数转罗马数字", result, num);
    }

    /**
     * 测试 58. 最后一个单词的长度
     */
    private static void testLengthOfLastWord(TopInterview150Part1 solution) {
        String string = "   fly me   to   the moon  ";
        int result = solution.lengthOfLastWord(string);
        SimpleTest.testReturn("58. 最后一个单词的长度", result, string);
    }

    /**
     * 测试 14. 最长公共前缀
     */
    private static void testLongestCommonPrefix(TopInterview150Part1 solution) {
        String[] strings = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strings);
        SimpleTest.testReturnWithArray("14. 最长公共前缀", result, strings);
    }

    /**
     * 测试 151. 反转字符串中的单词
     */
    private static void testReverseWords(TopInterview150Part1 solution) {
        String s = "the sky is blue";
        String result = solution.reverseWords(s);
        SimpleTest.testReturn("151. 反转字符串中的单词", result, s);
    }

    /**
     * 测试 6. Z字形变换
     */
    private static void testConvert(TopInterview150Part1 solution) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(s, numRows);
        SimpleTest.testReturn("6. Z字形变换", result, s, numRows);
    }

    /**
     * 测试 28. 找出字符串中第一个匹配项的下标
     */
    private static void testStrStr(TopInterview150Part1 solution) {
        String haystack = "ABABABABCA";
        String needle = "ABABC";
        int result = solution.strStr(haystack, needle);
        SimpleTest.testReturn("28. 找出字符串中第一个匹配项的下标", result, haystack, needle);
    }

    /**
     * 测试 68. 文本左右对齐
     */
    private static void testFullJustify(TopInterview150Part1 solution) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = solution.fullJustify(words, maxWidth);
        SimpleTest.testReturnWithArray("68. 文本左右对齐", result, words, maxWidth);
    }

    /**
     * 测试 125. 验证回文串
     */
    private static void testIsPalindrome(TopInterview150Part1 solution) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        SimpleTest.testReturn("125. 验证回文串", result, s);
    }

    /**
     * 测试 392. 判断子序列
     */
    private static void testIsSubsequence(TopInterview150Part1 solution) {
        String s = "";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        SimpleTest.testReturn("392. 判断子序列", result, s, t);
    }

    /**
     * 测试 167. 两数之和 II - 输入有序数组
     */
    private static void testTwoSum2(TopInterview150Part1 solution) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum2(numbers, target);
        SimpleTest.testReturnWithArray("167. 两数之和 II - 输入有序数组", result, numbers, target);
    }

    /**
     * 测试 11. 盛最多水的容器
     */
    private static void testMaxArea(TopInterview150Part1 solution) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        SimpleTest.testReturnWithArray("11. 盛最多水的容器", result, height);
    }

    /**
     * 测试 15. 三数之和
     */
    private static void testThreeSum(TopInterview150Part1 solution) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        SimpleTest.testReturnWithArray("15. 三数之和", result, nums);
    }

    /**
     * 测试 209. 长度最小的子数组
     */
    private static void testMinSubArrayLen(TopInterview150Part1 solution) {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int result = solution.minSubArrayLen(target, nums);
        SimpleTest.testReturnWithArray("209. 长度最小的子数组", result, nums, target);
    }

    /**
     * 测试 3. 无重复字符的最长子串
     */
    private static void testLengthOfLongestSubstring(TopInterview150Part1 solution) {
        String s = "pwwkew";
        int result = solution.lengthOfLongestSubstring(s);
        SimpleTest.testReturn("3. 无重复字符的最长子串", result, s);
    }

    /**
     * 测试 30. 串联所有单词的子串
     */
    private static void testFindSubstring(TopInterview150Part1 solution) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> result = solution.findSubstring(s, words);
        SimpleTest.testReturnWithArrays("30. 串联所有单词的子串", result, s, words);
    }

    /**
     * 测试 76. 最小覆盖子串
     */
    private static void testMinWindow(TopInterview150Part1 solution) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        SimpleTest.testReturn("76. 最小覆盖子串", result, s, t);
    }

    /**
     * 测试 36. 有效的数独
     */
    private static void testIsValidSudoku(TopInterview150Part1 solution) {
        char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean result = solution.isValidSudoku(board);
        SimpleTest.testReturnWithArray("36. 有效的数独", result, board);
    }

    /**
     * 测试 54. 螺旋矩阵
     */
    private static void testSpiralOrder(TopInterview150Part1 solution) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = solution.spiralOrder(matrix);
        SimpleTest.testReturnWithArray("54. 螺旋矩阵", result, matrix);
    }

    /**
     * 测试 48. 旋转图像
     */
    private static void testRotateImage(TopInterview150Part1 solution) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] original = SimpleTest.copy(matrix);
        solution.rotate(matrix);
        SimpleTest.testInPlace("48. 旋转图像", original, matrix);
    }

    /**
     * 测试 73. 矩阵置零
     */
    private static void testSetZeroes(TopInterview150Part1 solution) {
        int[][] matrix = {{1, 0}};
        int[][] original = SimpleTest.copy(matrix);
        solution.setZeroes(matrix);
        SimpleTest.testInPlace("73. 矩阵置零", original, matrix);
    }

    /**
     * 测试 289. 生命游戏
     */
    private static void testGameOfLife(TopInterview150Part1 solution) {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] original = SimpleTest.copy(board);
        solution.gameOfLife(board);
        SimpleTest.testInPlace("289. 生命游戏", original, board);
    }

    /**
     * 测试 383. 赎金信
     */
    private static void testCanConstruct(TopInterview150Part1 solution) {
        String ransomNote = "a";
        String magazine = "b";
        boolean result = solution.canConstruct(ransomNote, magazine);
        SimpleTest.testReturn("383. 赎金信", result, ransomNote, magazine);
    }

    /**
     * 测试 205. 同构字符串
     */
    private static void testIsomorphicStrings(TopInterview150Part1 solution) {
        String s = "badc";
        String t = "baba";
        boolean result = solution.isIsomorphic(s, t);
        SimpleTest.testReturn("205. 同构字符串", result, s, t);
    }

    /**
     * 测试 290. 单词规律
     */
    private static void testWordPattern(TopInterview150Part1 solution) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = solution.wordPattern(pattern, s);
        SimpleTest.testReturn("290. 单词规律", result, pattern, s);
    }

    /**
     * 测试 242. 有效的字母异位词
     */
    private static void testValidAnagram(TopInterview150Part1 solution) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        SimpleTest.testReturn("242. 有效的字母异位词", result, s, t);
    }

    /**
     * 测试 49. 字母异位词分组
     */
    private static void testGroupAnagrams(TopInterview150Part1 solution) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        SimpleTest.testReturnWithArray("49. 字母异位词分组", result, strs);
    }

    /**
     * 测试 1. 两数之和
     */
    private static void testTwoSum1(TopInterview150Part1 solution) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        SimpleTest.testReturnWithArray("1. 两数之和", result, nums, target);
    }

    /**
     * 测试 202. 快乐数
     */
    private static void testIsHappy(TopInterview150Part1 solution) {
        int n = 19;
        boolean result = solution.isHappy(n);
        SimpleTest.testReturn("202. 快乐数", result, n);
    }

    /**
     * 测试 219. 存在重复元素 II
     */
    private static void testContainsNearbyDuplicate(TopInterview150Part1 solution) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = solution.containsNearbyDuplicate(nums, k);
        SimpleTest.testReturnWithArray("219. 存在重复元素 II", result, nums, k);
    }

    /**
     * 测试 128. 最长连续序列
     */
    private static void testLongestConsecutive(TopInterview150Part1 solution) {
        int[] nums = {0};
        int result = solution.longestConsecutive(nums);
        SimpleTest.testReturnWithArray("128. 最长连续序列", result, nums);
    }

    /**
     * 测试 228. 汇总区间
     */
    private static void testSummaryRanges(TopInterview150Part1 solution) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = solution.summaryRanges(nums);
        SimpleTest.testReturnWithArray("228. 汇总区间", result, nums);
    }

    /**
     * 测试 56. 合并区间
     */
    private static void testMergeIntervals(TopInterview150Part1 solution) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = solution.merge(intervals);
        SimpleTest.testReturnWithArray("56. 合并区间", result, intervals);
    }

    /**
     * 测试 57. 插入区间
     */
    private static void testInsertIntervals(TopInterview150Part1 solution) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = solution.insert(intervals, newInterval);
        SimpleTest.testReturnWithArrays("57. 插入区间", result, intervals, newInterval);
    }

    /**
     * 测试 452. 用最少数量的箭引爆气球
     */
    private static void testFindMinArrowShots(TopInterview150Part2 solution) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int result = solution.findMinArrowShots(points);
        SimpleTest.testReturnWithArray("452. 用最少数量的箭引爆气球", result, points);
    }

    /**
     * 测试 20. 有效的括号
     */
    private static void testIsValid(TopInterview150Part2 solution) {
        String s = "()[]{}";
        boolean result = solution.isValid(s);
        SimpleTest.testReturn("20. 有效的括号", result, s);
    }

    /**
     * 测试 71. 简化路径
     */
    private static void testSimplifyPath(TopInterview150Part2 solution) {
        String path = "/../";
        String result = solution.simplifyPath(path);
        SimpleTest.testReturn("71. 简化路径", result, path);
    }

    /**
     * 测试 155. 最小栈
     */
    private static void testMinStack(TopInterview150Part2 solution) {
        TopInterview150Part2.MinStack minStack = new TopInterview150Part2.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int step1 = minStack.getMin(); // 返回 -3.
        minStack.pop();
        int step2 = minStack.top();    // 返回 0.
        int step3 = minStack.getMin(); // 返回 -2.
        boolean result = (step1 == -3) && (step2 == 0) && (step3 == -2);
        SimpleTest.testReturn("155. 最小栈", result);
    }

    /**
     * 测试 150. 逆波兰表达式求值
     */
    private static void testEvalRPN(TopInterview150Part2 solution) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = solution.evalRPN(tokens);
        SimpleTest.testReturnWithArray("150. 逆波兰表达式求值", result, tokens);
    }
}