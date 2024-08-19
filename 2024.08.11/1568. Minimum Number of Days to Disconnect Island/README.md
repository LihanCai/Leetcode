# Leetcode 1568

这个题目是一个很奇怪的文字游戏，只要场面上不是一座岛屿就算分离。照这个思路，只有三种情况：要么本身就是分离的；要么一步就能使分离，即两个岛屿之间只连着一块；其它任意情况最多只需两步，即孤立任意一个角。所以答案只有0（本身存在两个孤立的岛屿），1（该岛屿为1*n的岛屿或者n*1的岛屿），2（该岛屿宽和长都至少》=2，则选择某个角，将相邻的两块变为水即可）三个选项。那么我们只要依次检查本身是否存在两个孤立的岛屿以及是否存在仅仅只有一个岛屿的答案即可。