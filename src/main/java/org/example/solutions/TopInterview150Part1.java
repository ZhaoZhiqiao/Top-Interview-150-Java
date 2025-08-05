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
        Map<Character, Integer> dict = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
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
            if (end < words.length && length + words[end].length() <= maxWidth) {
                length = length + words[end].length();
                end++;
            } else {
                length -= 1;
            }
            int space = maxWidth - length + ((end - start) - 1);
            int repeat = (end - start) == 1 ? space : space / ((end - start) - 1);
            int diff = (end - start) == 1 ? 0 : space % ((end - start) - 1);
            for (int i = start; i < end; i++) {
                currentWord.append(words[i]);
                currentWord.append(" ".repeat(diff > 0 ? repeat + 1 : repeat));
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
            if (currentWord.length() > maxWidth) {
                currentWord.delete(maxWidth, currentWord.length());
            } else {
                currentWord.append(" ".repeat(maxWidth - currentWord.length()));
            }
            result.add(currentWord.toString());
        }
        return result;
    }

    /**
     * 125. 验证回文串
     */
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start)) && start != end) {
                start++;
            }
            while (!Character.isLetterOrDigit(s.charAt(end)) && start != end) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 392. 判断子序列
     */
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length() && sIndex < s.length(); tIndex++) {
            char currentChar = t.charAt(tIndex);
            if (s.charAt(sIndex) == currentChar) {
                sIndex++;
            }
            if (sIndex == s.length()) {
                break;
            }
        }
        return sIndex == s.length();
    }

    /**
     * 167. 两数之和 II - 输入有序数组
     */
    public int[] twoSum(int[] numbers, int target) {
        int slow = 0, fast = numbers.length - 1;
        while (slow < fast) {
            int sum = numbers[slow] + numbers[fast];
            if (sum == target) {
                return new int[]{slow + 1, fast + 1};
            } else if (sum < target) {
                slow++;
            } else {
                fast--;
            }
        }
        return numbers;
    }

    /**
     * 11. 盛最多水的容器
     */
    public int maxArea(int[] height) {
        int maxCapacity = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int capacity = Math.min(height[left], height[right]) * (right - left);
            maxCapacity = Math.max(maxCapacity, capacity);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxCapacity;
    }

    /**
     * 15. 三数之和
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

    /**
     * 209. 长度最小的子数组
     */
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0, left = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    /**
     * 3. 无重复字符的最长子串
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int right = 0, left = 0, maxLength = 0;
        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    /**
     * 30. 串联所有单词的子串
     */
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words.length == 0) return result;

        HashMap<String, Integer> allWords = new HashMap<>();
        for (String word : words) {
            allWords.put(word, allWords.getOrDefault(word, 0) + 1);
        }
        int wordLength = words[0].length();

        for (int start = 0; start < wordLength; start++) {
            HashMap<String, Integer> hasWords = new HashMap<>();
            int num = 0;
            for (int i = start; i < s.length() - wordLength * words.length + 1; i += wordLength) {
                boolean hasRemoved = false;
                while (num < words.length) {
                    String word = s.substring(i + num * wordLength, i + (num + 1) * wordLength);
                    if (allWords.containsKey(word)) {
                        hasWords.put(word, hasWords.getOrDefault(word, 0) + 1);
                        if (hasWords.get(word) > allWords.get(word)) {
                            hasRemoved = true;
                            int removeNum = 0;
                            while (hasWords.get(word) > allWords.get(word)) {
                                String currentWord = s.substring(i + removeNum * wordLength, i + (removeNum + 1) * wordLength);
                                hasWords.put(currentWord, hasWords.get(currentWord) - 1);
                                removeNum++;
                            }
                            num = num - removeNum + 1;
                            i = i + (removeNum - 1) * wordLength;
                            break;
                        }
                    } else {
                        hasWords.clear();
                        i += num * wordLength;
                        num = 0;
                        break;
                    }
                    num++;
                }
                if (num == words.length) {
                    result.add(i);
                }

                if (num > 0 && !hasRemoved) {
                    String firstWord = s.substring(i, i + wordLength);
                    hasWords.put(firstWord, hasWords.get(firstWord) - 1);
                    num = num - 1;
                }

            }

        }
        return result;
    }

    /**
     * 76. 最小覆盖子串
     */
    public String minWindow(String s, String t) {
        int start = 0, end = 0, maxLen = Integer.MAX_VALUE;
        int[] result = new int[2];
        HashMap<Character, Integer> allChar = new HashMap<>();
        for (Character ch : t.toCharArray()) {
            allChar.put(ch, allChar.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> hasChar = new HashMap<>();

        while (end < s.length()) {
            if (allChar.containsKey(s.charAt(end))) {
                hasChar.put(s.charAt(end), hasChar.getOrDefault(s.charAt(end), 0) + 1);
            }
            while (check(allChar, hasChar) && start <= end) {
                if (maxLen > end - start + 1) {
                    maxLen = end - start + 1;
                    result[0] = start;
                    result[1] = start + maxLen;
                }
                if (allChar.containsKey(s.charAt(start))) {
                    hasChar.put(s.charAt(start), hasChar.get(s.charAt(start)) - 1);
                }
                start++;
            }
            end++;
        }
        return s.substring(result[0], result[1]);
    }

    public boolean check(HashMap<Character, Integer> allChar, HashMap<Character, Integer> hasChar) {
        for (Character ch : allChar.keySet()) {
            if (hasChar.getOrDefault(ch, 0) < allChar.get(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 36. 有效的数独
     */
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>(9);
        Map<Integer, Set<Character>> columns = new HashMap<>(9);
        Map<Integer, Set<Character>> blocks = new HashMap<>(9);
        for (int index = 0; index < 9; index++) {
            columns.put(index, new HashSet<>(9));
            blocks.put(index, new HashSet<>(9));
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char currentChar = board[i][j];
                int blockIndex = (i / 3) * 3 + j / 3;
                if (currentChar == '.') {
                    continue;
                }
                if (row.contains(currentChar) || columns.get(j).contains(currentChar) || blocks.get(blockIndex).contains(currentChar)) {
                    return false;
                }
                row.add(currentChar);
                columns.get(j).add(currentChar);
                blocks.get(blockIndex).add(currentChar);
            }
            row.clear();
        }
        return true;
    }

    /**
     * 54. 螺旋矩阵
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        while(left <= right && top <= bottom) {
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}