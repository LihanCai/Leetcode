 # Leetcode 1905

 题目解读：寻找grid2数组中为grid1子岛屿的个数。岛屿定义：上下左右相连的为1的格子，一个完整的为一个岛屿。子岛屿定义：该岛屿被grid1的某一个岛屿全覆盖。

1. 如果坐标 i, j 超出矩阵的边界或 A[i][j] == 0（即这个位置不是岛屿的一部分），返回1，因为它不会影响当前岛屿的子岛屿判断,随后标记当前节点，即将A[i][j]设为0，表示已经访问过该节点，以防止重复访问。然后递归调用dfs函数，对当前节点的四个方向（上、下、左、右）进行递归检查。如果在任何一个方向上发现该岛屿不属于B，则res将变为0。然后当当前遍历位置为1的时候说明存在岛屿，开始递归调用dfs判断是否为子岛屿即可。