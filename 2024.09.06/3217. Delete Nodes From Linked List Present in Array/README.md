# Leetcode 3217

题目解读：给定数组nums和一个链表，将链表中所有在nums数组中的元素全部删除。

一道模拟过程的题目，每次选择链表中的元素，看是否存在于nums数组中，如果存在则删除。

这道题的关键时间复杂度优化在于，你可以将nums转换成hashset的数据结构，这样子，查看当前元素是否存在于该元素中只需要O(1)的时间复杂度。