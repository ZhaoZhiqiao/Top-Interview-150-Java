# Leetcode-JAVA练习笔记

> Leetcode 面试经典 150 题 做题记录

---

## 📚 项目结构

```
Top-Interview-150-Java/
├── src/main/java/org/example/
│   ├── solutions/           # 解题代码
│   │   ├── TopInterview150Part1.java    # 前50题
│   │   ├── TopInterview150Part2.java    # 51-100题
│   │   └── TopInterview150Part3.java    # 101-150题
│   ├── datastructure/       # 数据结构定义
│   │   ├── ListNode.java    # 链表节点
│   │   ├── TreeNode.java    # 二叉树节点
│   │   ├── Node.java        # 带随机指针的节点
│   │   ├── QuadTreeNode.java # 四叉树节点
│   │   └── Trie.java        # 字典树
│   ├── utils/
│   │   └── SimpleTest.java  # 测试工具类
│   └── TestRunner.java      # 测试运行器
└── README.md
```

## 🚀 使用方法

1. **运行单个测试**：编辑 `TestRunner.java`，取消注释想要测试的方法
2. **添加新题目**：在对应的 Part 文件中添加解决方案
3. **测试工具**：使用 `SimpleTest` 类进行快速测试

---

## 📈 题目列表

### 🏷️ 数组 / 字符串
- [x] 合并两个有序数组![简单](https://img.shields.io/badge/-简单-green)
- [x] 移除元素 ![简单](https://img.shields.io/badge/-简单-green)
- [x] 删除有序数组中的重复项 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 删除有序数组中的重复项 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 多数元素 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 轮转数组 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 买卖股票的最佳时机 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 买卖股票的最佳时机 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 跳跃游戏 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 跳跃游戏 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] H 指数 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] O(1) 时间插入、删除和获取随机元素 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 除自身以外数组的乘积 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 加油站 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 分发糖果 ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 接雨水 ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 罗马数字转整数 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 整数转罗马数字 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 最后一个单词的长度 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 最长公共前缀 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 反转字符串中的单词 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] Z 字形变换 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 找出字符串中第一个匹配项的下标 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 文本左右对齐 ![困难](https://img.shields.io/badge/-困难-red)

### 🎯 双指针
- [ ] 验证回文串 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 判断子序列 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 两数之和 II - 输入有序数组 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 盛最多水的容器 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 三数之和 ![中等](https://img.shields.io/badge/-中等-orange)

### 🪟 滑动窗口
- [ ] 长度最小的子数组 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 无重复字符的最长子串 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 串联所有单词的子串 ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 最小覆盖子串 ![困难](https://img.shields.io/badge/-困难-red)

### 🔢 矩阵
- [ ] 有效的数独 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 螺旋矩阵 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 旋转图像 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 矩阵置零 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 生命游戏 ![中等](https://img.shields.io/badge/-中等-orange)

### 🗂️ 哈希表
- [ ] 赎金信 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 同构字符串 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 单词规律 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 有效的字母异位词 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 字母异位词分组 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 两数之和 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 快乐数 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 存在重复元素 II ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 最长连续序列 ![中等](https://img.shields.io/badge/-中等-orange)

### 📊 区间
- [ ] 汇总区间 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 合并区间 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 插入区间 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 用最少数量的箭引爆气球 ![中等](https://img.shields.io/badge/-中等-orange)

### 📚 栈
- [ ] 有效的括号 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 简化路径 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 最小栈 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 逆波兰表达式求值 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 基本计算器 ![困难](https://img.shields.io/badge/-困难-red)

### 🔗 链表
- [ ] 环形链表 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 两数相加 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 合并两个有序链表 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 随机链表的复制 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 反转链表 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] K 个一组翻转链表 ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 删除链表的倒数第 N 个结点 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 删除排序链表中的重复元素 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 旋转链表 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 分隔链表 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] LRU 缓存 ![中等](https://img.shields.io/badge/-中等-orange)

### 🌳 二叉树
- [ ] 二叉树的最大深度 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 相同的树 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 翻转二叉树 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 对称二叉树 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 从前序与中序遍历序列构造二叉树 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 从中序与后序遍历序列构造二叉树 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 填充每个节点的下一个右侧节点指针 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 二叉树展开为链表 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 路径总和 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 求根节点到叶节点数字之和 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 二叉树中的最大路径和 ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 二叉搜索树迭代器 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 完全二叉树的节点个数 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 二叉树的最近公共祖先 ![中等](https://img.shields.io/badge/-中等-orange)

### 🌳 二叉树层次遍历
- [ ] 二叉树的右视图 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 二叉树的层平均值 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 二叉树的层序遍历 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 二叉树的锯齿形层序遍历 ![中等](https://img.shields.io/badge/-中等-orange)

### 🔍 二叉搜索树
- [ ] 二叉搜索树的最小绝对差 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 二叉搜索树中第 K 小的元素 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 验证二叉搜索树 ![中等](https://img.shields.io/badge/-中等-orange)

### 🕸️ 图
- [ ] 岛屿数量 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 被围绕的区域 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 克隆图 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 除法求值 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 课程表 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 课程表 II ![中等](https://img.shields.io/badge/-中等-orange)

### 🌊 图的广度优先搜索
- [ ] 蛇梯棋 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 最小基因变化 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 单词接龙 ![困难](https://img.shields.io/badge/-困难-red)

### 📖 字典树
- [ ] 实现 Trie (前缀树) ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 添加与搜索单词 - 数据结构设计 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 单词搜索 II ![困难](https://img.shields.io/badge/-困难-red)

### 🔄 回溯
- [ ] 电话号码的字母组合 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 组合 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 全排列 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 组合总和 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] N 皇后 II ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 括号生成 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 单词搜索 ![中等](https://img.shields.io/badge/-中等-orange)

### ⚡ 分治
- [ ] 将有序数组转换为二叉搜索树 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 排序链表 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 建立四叉树 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 合并 K 个升序链表 ![困难](https://img.shields.io/badge/-困难-red)

### 📈 Kadane 算法
- [ ] 最大子数组和 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 环形子数组的最大和 ![中等](https://img.shields.io/badge/-中等-orange)

### 🔍 二分查找
- [ ] 搜索插入位置 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 搜索二维矩阵 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 寻找峰值 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 搜索旋转排序数组 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 在排序数组中查找元素的第一个和最后一个位置 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 寻找旋转排序数组中的最小值 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 寻找两个正序数组的中位数 ![困难](https://img.shields.io/badge/-困难-red)

### 🏔️ 堆
- [ ] 数组中的第K个最大元素 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] IPO ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 查找和最小的 K 对数字 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 数据流的中位数 ![困难](https://img.shields.io/badge/-困难-red)

### 🔢 位运算
- [ ] 二进制求和 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 颠倒二进制位 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 位1的个数 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 只出现一次的数字 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 只出现一次的数字 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 数字范围按位与 ![中等](https://img.shields.io/badge/-中等-orange)

### 🧮 数学
- [ ] 回文数 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 加一 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 阶乘后的零 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] x 的平方根 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] Pow(x, n) ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 直线上最多的点数 ![困难](https://img.shields.io/badge/-困难-red)

### 📊 一维动态规划
- [ ] 爬楼梯 ![简单](https://img.shields.io/badge/-简单-green)
- [ ] 打家劫舍 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 单词拆分 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 零钱兑换 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 最长递增子序列 ![中等](https://img.shields.io/badge/-中等-orange)

### 📈 多维动态规划
- [ ] 三角形最小路径和 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 最小路径和 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 不同路径 II ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 最长回文子串 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 交错字符串 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 编辑距离 ![中等](https://img.shields.io/badge/-中等-orange)
- [ ] 买卖股票的最佳时机 III ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 买卖股票的最佳时机 IV ![困难](https://img.shields.io/badge/-困难-red)
- [ ] 最大正方形 ![中等](https://img.shields.io/badge/-中等-orange)

---

## � 进度统计

![Progress](https://img.shields.io/badge/完成进度-3%2F150-red)
![Easy](https://img.shields.io/badge/简单-3%2F39-green)
![Medium](https://img.shields.io/badge/中等-0%2F77-orange)
![Hard](https://img.shields.io/badge/困难-0%2F34-red)

---

## �📝 刷题心得

> 这里可以添加您的刷题心得和总结

---

## 🔧 技术栈

- **语言**：Java 8+
- **构建工具**：Maven
- **数据结构**：数组、链表、二叉树、字典树、四叉树等
- **算法类型**：双指针、滑动窗口、回溯、动态规划、广度优先搜索、深度优先搜索等