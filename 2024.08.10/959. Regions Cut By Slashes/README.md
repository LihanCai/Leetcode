 # Leetcode 959

我们可以将问题转化为图的连通性问题。具体而言，利用并查集（Disjoint Set）将二维网格中的每个交点（格子边缘交汇的点）视为图中的一个节点，斜线则是这些节点之间的连通边。通过判断每个节点之间的连通性，我们可以确定划分出的区域数量。

边界处理：

由于每个点都有n+1行和n+1列，所以整个网格中有(n+1)*(n+1)个点。
通过遍历网格边界的点并将它们与第一个点（0, 0）进行合并，确保边界部分的点都属于同一个集合。这相当于将整个外部区域视为一个单独的大区域。
处理斜线：

遍历每个网格单元，根据斜线的方向决定连接哪些点。
对于/斜线：连接当前单元格右上角和左下角的点。
对于\斜线：连接当前单元格左上角和右下角的点。
每次合并操作时，判断这些点是否已经在同一个集合内。如果是，说明一个新区域被切分出来，因此增加count。
返回结果：

最终返回ds.count，即经过所有合并操作后，区域的总数。