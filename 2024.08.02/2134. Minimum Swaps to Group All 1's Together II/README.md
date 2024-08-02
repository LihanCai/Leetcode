# Leetcode 2134
这道题的意思就是求将所有1聚合到一起所需要花的最小交换次数，交换操作是直接将当前位置和目标位置进行调换。但需要注意的是，题目要求将这个数组当作环来考虑。

既然是要找聚合花费最小的，我们的目标就可以转换成寻找某个长度内1最多的群体，以此为基础就能计算出花费最小的了。

那这个长度怎么来呢？

我的想法是先统计1的个数，把这个当作我们的基准。用滑动窗口的思想来解决这个题目。在固定窗口大小内，寻找这个窗口可能覆盖的最多的1，它和统计的1的总数的差值即为答案。

那怎么解决环的问题呢？

让我们的窗口能够从尾开始能够连接头部。因为，环只需要计算一次，你让头去连接尾部的操作比较麻烦。当计算下标的时候，下标计算方式改为(i+count)%n就可以了。