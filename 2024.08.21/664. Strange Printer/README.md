# Leetcode 664

题目解读：有一个打印机，每次打印只能打印一样的字符串，并且每一次打印的对应位置会完全覆盖之前的打印内容，求打印目标字符串所需要的最少次数。

看了题解之后做的，这个题目当时觉得之前字符串的状态是动态变化的，当字符串从a变成ab变成aba之后是有联系的，但是不知道怎么做，结果递推公式为：min = Math.min(min, dp[i][k] + dp[k + 1][j])。也就是说，将当前字符串拆成前后两个部分，分而求之，每次都拆分成，打印开始位置为i，结束位置为j的字符串所需要的最小次数，不断遍历。



动态规划五步
1. 确定动态规划数组意义：dp[i][j]为打印开始位置为i，结束位置为j的字符串所需要的最小次数
2. 初始化动态数组：初始化为Integer.MAX_VALUE
3. 确定递归公式：min = Math.min(min, dp[i][k] + dp[k + 1][j])
4. 确定递推顺序：外循环从后向前，内循环从前向后
5. dry run代码
