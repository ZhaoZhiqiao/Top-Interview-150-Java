package org.example.utils;

import org.example.datastructure.ListNode;
import org.example.datastructure.TreeNode;

import java.util.*;

/**
 * 通用的简单测试工具
 * 支持各种数据类型：int, 数组, 链表, 树, List, Map 等
 */
@SuppressWarnings("unused")
public class SimpleTest {

    /**
     * 🎯 通用测试方法 - 支持任意数据类型
     *
     * @param title  测试标题
     * @param result 返回值
     * @param inputs 输入参数（可变参数）
     */
    public static void testReturn(String title, Object result, Object... inputs) {
        System.out.println("\n🧪 " + title);

        // 打印输入
        if (inputs.length == 1) {
            System.out.println("输入: " + formatObject(inputs[0]));
        } else if (inputs.length > 1) {
            System.out.println("输入:");
            for (int i = 0; i < inputs.length; i++) {
                System.out.println("  参数" + (i + 1) + ": " + formatObject(inputs[i]));
            }
        }

        // 打印返回值
        System.out.println("返回: " + formatObject(result));
    }

    /**
     * 🎯 单个数组参数的测试方法 - 避免varargs混淆
     *
     * @param title      测试标题
     * @param result     返回值
     * @param arrayInput 单个数组输入参数
     */
    public static void testReturnWithArray(String title, Object result, Object arrayInput) {
        System.out.println("\n🧪 " + title);
        System.out.println("输入: " + formatObject(arrayInput));
        System.out.println("返回: " + formatObject(result));
    }

    /**
     * 🎯 数组加其他参数的测试方法 - 避免varargs混淆
     *
     * @param title       测试标题
     * @param result      返回值
     * @param arrayInput  数组输入参数
     * @param otherInputs 其他输入参数
     */
    public static void testReturnWithArray(String title, Object result, Object arrayInput, Object... otherInputs) {
        System.out.println("\n🧪 " + title);
        System.out.println("输入:");
        System.out.println("  参数1: " + formatObject(arrayInput));
        for (int i = 0; i < otherInputs.length; i++) {
            System.out.println("  参数" + (i + 2) + ": " + formatObject(otherInputs[i]));
        }
        System.out.println("返回: " + formatObject(result));
    }

    /**
     * 🎯 数组与其他数组的测试方法 - 避免varargs混淆
     *
     * @param title            测试标题
     * @param result           返回值
     * @param arrayInput       第一个数组输入参数
     * @param otherArrayInput  第二个数组输入参数
     */
    public static void testReturnWithArrays(String title, Object result, Object arrayInput, Object otherArrayInput) {
        System.out.println("\n🧪 " + title);
        System.out.println("输入:");
        System.out.println("  参数1: " + formatObject(arrayInput));
        System.out.println("  参数2: " + formatObject(otherArrayInput));
        System.out.println("返回: " + formatObject(result));
    }


    /**
     * 🔄 原地修改测试 - 支持任意类型的原地修改
     *
     * @param title       测试标题
     * @param original    原始数据
     * @param modified    修改后的数据
     * @param otherInputs 其他输入参数
     */
    public static void testInPlace(String title, Object original, Object modified, Object... otherInputs) {
        System.out.println("\n🧪 " + title);
        System.out.println("原始: " + formatObject(original));

        if (otherInputs.length > 0) {
            System.out.print("其他参数: ");
            for (int i = 0; i < otherInputs.length; i++) {
                System.out.print(formatObject(otherInputs[i]));
                if (i < otherInputs.length - 1) System.out.print(", ");
            }
            System.out.println();
        }

        System.out.println("结果: " + formatObject(modified));
    }

    /**
     * 📄 格式化各种类型的对象为字符串
     */
    private static String formatObject(Object obj) {
        if (obj == null) {
            return "null";
        }

        // 基本类型
        if (obj instanceof Integer || obj instanceof Long || obj instanceof Double || obj instanceof Float || obj instanceof Boolean || obj instanceof Character || obj instanceof String) {
            return obj.toString();
        }

        return switch (obj) {
            case int[] arr -> Arrays.toString(arr);
            case long[] arr -> Arrays.toString(arr);
            case double[] arr -> Arrays.toString(arr);
            case boolean[] arr -> Arrays.toString(arr);
            case char[] arr -> Arrays.toString(arr);
            case String[] arr -> Arrays.toString(arr);
            case int[][] matrix -> Arrays.deepToString(matrix);
            case Object[] arr -> Arrays.toString(arr);
            case ListNode node -> node.toString();
            case TreeNode tree -> Arrays.toString(TreeNode.toArray(tree));
            case List<?> list -> list.toString();
            case Map<?, ?> map -> map.toString();
            case Set<?> set -> set.toString();
            default -> obj.toString();
        };
    }

    // ========== 便捷方法 ==========

    /**
     * 快速创建链表
     */
    public static ListNode list(int... values) {
        return ListNode.fromArray(values);
    }

    /**
     * 快速创建二叉树
     */
    public static TreeNode tree(Integer... values) {
        return TreeNode.fromArray(values);
    }

    /**
     * 快速创建 List
     */
    public static List<Integer> listOf(int... values) {
        List<Integer> list = new ArrayList<>();
        for (int value : values) {
            list.add(value);
        }
        return list;
    }

    /**
     * 快速创建字符串 List
     */
    public static List<String> listOf(String... values) {
        return Arrays.asList(values);
    }

    /**
     * 复制一维数组
     */
    public static int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    /**
     * 复制二维数组
     */
    public static int[][] copy(int[][] matrix) {
        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return copy;
    }

    /**
     * 复制字符串数组
     */
    public static String[] copy(String[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

}
