# Leetcode 135
把题目条件比相邻两边大拆分成比左边大和比右边大。先从前向后遍历，使得右边比左边评分更高的得到的糖果数比左边多一个。再从后向前遍历，使得左边比右边评分更高的得到的糖果数比右边多一个，这样两个条件就都满足了。

需要注意的是，反过来是不可以的！从前向后遍历，必须是保证右边比左边评分更高的得到的糖果数比左边多一个，因为从前向后遍历的潜在条件就是，当前位置的左侧已经满足都比其左边大的条件了。从后向前遍历也是一样的原理。