package org.example.solutions;


import java.util.*;

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
     * 45. 跳跃游戏 II
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

    /**
     * 274. H 指数
     */
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int index = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > index) {
            index++;
            i--;
        }
        return index;
    }

    /**
     * 380. O(1) 时间插入、删除和获取随机元素
     */
    @SuppressWarnings("InnerClassMayBeStatic")
    public class RandomizedSet {
        HashMap<Integer, Integer> map;
        List<Integer> list;
        Random random;

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            } else {
                list.add(val);
                map.put(val, list.size() - 1);
                return true;
            }
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            } else {
                Integer index = map.get(val);
                Integer LastElement = list.getLast();
                list.set(index, LastElement);
                map.put(LastElement, index);
                list.removeLast();
                map.remove(val);
                return true;
            }
        }

        public int getRandom() {
            int index = random.nextInt(list.size());
            return list.get(index);
        }
    }

    /**
     * 238. 除自身以外数组的乘积
     */
    public int[] productExceptSelf(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length);
        for (int i = 0, left = 1; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1, right = 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    /**
     * 134.  加油站
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; ) {
            int total = 0;
            int cnt = 0;
            while (cnt < gas.length) {
                int index = (i + cnt) % gas.length;
                total += gas[index] - cost[index];
                if (total < 0) {
                    break;
                }
                cnt++;
            }
            if (cnt == gas.length) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }

    /**
     * 135.  分发糖果
     */
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }
        return Arrays.stream(candies).sum();
    }

    /**
     * 42. 接雨水
     */
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = height[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = max;
            max = Math.max(max, height[i]);
        }

        max = height[height.length - 1];
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = max;
            max = Math.max(max, height[i]);
        }

        int count = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int capacity = (Math.min(left[i], right[i]) - height[i]);
            if (capacity > 0) {
                count += capacity;
            }
        }

        return count;
    }

    /**
     * 13. 罗马数字转整数
     */
    public int romanToInt(String s) {
        Map<Character, Integer> dict = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        char[] words = s.toCharArray();
        int num = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (dict.get(words[i]) < dict.get(words[i + 1])) {
                num -= dict.get(words[i]);
            } else {
                num += dict.get(words[i]);
            }
        }
        num += dict.get(words[words.length - 1]);
        return num;
    }

    /**
     * 12. 整数转罗马数字
     */
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; ++i) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }

    /**
     * 58. 最后一个单词的长度
     */
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int end = chars.length - 1;
        while (end >= 0 && chars[end] == ' ') {
            end--;
        }
        int start = end;
        while (start >= 0 && chars[start] != ' ') {
            start--;
        }
        return end - start;
    }

    /**
     * 14. 最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }
        return prefix.toString();
    }

    /**
     * 151. 反转字符串中的单词
     */
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;
        int start = end;
        while (start >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
                start--;
            }
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            if (start != end) {
                result.append(s, start + 1, end + 1).append(' ');
            }
            end = start;
        }
        return result.toString();
    }

    /**
     * 6. Z字形变换
     */
    public String convert(String s, int numRows) {
        int rowNums = numRows == 1 ? 1 : numRows * 2 - 2;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (j % rowNums == i || j % rowNums == rowNums - i) {
                    res.append(s.charAt(j));
                }
            }
        }
        return res.toString();
    }

    /**
     * 28. 找出字符串中第一个匹配项的下标
     */
    public int strStr(String haystack, String needle) {
        int[] next = build_next(needle);
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                i++;
            } else if (j > 0) {
                j = next[j - 1];
            } else {
                i++;
            }
            if (j == needle.length()) {
                return i - j;
            }
        }
        return -1;
    }

    private int[] build_next(String s) {
        int[] next = new int[s.length()];
        next[0] = 0;
        int patternLength = 0;
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(patternLength)) {
                patternLength++;
                next[i] = patternLength;
                i++;
            } else if (patternLength > 0) {
                patternLength = next[patternLength - 1];
            } else {
                next[i] = 0;
                i++;
            }
        }
        return next;
    }

    /**
     * 68. 文本左右对齐
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        int start = 0, end = 0;
        while (end < words.length) {
            start = end;
            int length = 0;
            while (end < words.length && length + words[end].length() + 1 < maxWidth) {
                length = length + words[end].length() + 1;
                end++;
            }
            if(end < words.length && length + words[end].length() <= maxWidth){
                length = length + words[end].length();
                end++;
            }else {
                length -= 1;
            }
            int space = maxWidth - length + ((end - start) - 1);
            int repeat = (end - start) == 1 ? space : space / ((end - start) - 1);
            int diff = (end - start) == 1 ? 0 : space % ((end - start) - 1);
            for (int i = start; i < end; i++) {
                currentWord.append(words[i]);
                currentWord.append(" ".repeat(diff > 0 ? repeat + 1: repeat));
                diff -= 1;
            }
            if (currentWord.length() > maxWidth) {
                currentWord.delete(maxWidth, currentWord.length());
            }
            result.add(currentWord.toString());
            currentWord.delete(0, currentWord.length());
        }
        if (end - start > 1) {
            result.removeLast();
            for (int i = start; i < end; i++) {
                currentWord.append(words[i]);
                currentWord.append(" ");
            }
            if(currentWord.length() > maxWidth){
                currentWord.delete(maxWidth, currentWord.length());
            }else {
                currentWord.append(" ".repeat(maxWidth - currentWord.length()));
            }
            result.add(currentWord.toString());
        }
        return result;
    }
}