# Leetcode 2699

题目解读：给定一个无向有权重的图，包含0到n-1个点，部分边的权重为-1，现在请你通过修改权重为-1的边，让从source点到destination点的最短路径恰好为target，若有多种方案，返回其中一个即可。

第一步，先构建图的数据结构，将边和权重存储起来。

迪杰斯特拉算法是一个很不错的可以考虑用来解决这个问题的算法，但是我们不能尝试每次都选择一个权重为-1的边，然后开始考虑让从source点到destination点的最短路径恰好为target，因为每一次的权重的更改都会影响最短路径，然后我们必须再一次运行迪杰斯特拉算法，这样子时间复杂度会非常夸张。

抓住题目中的关键，需要找到的是**最短**路径，并且路径必须为正数，那么不妨将所有权重为-1的边改成1先，这样的路径一定是最短路径，如果可实现的最短路径已经比target大了，说明这个输入是没有正确解的。

接下来就是关于修改权重的问题了，有一个问题需要非常注意，当你修改权重来让目前的最短路径向target靠近的时候，可能隐式地修改了其他路径的权重和，我们需要保证在修改权重的时候增加当前从source点到destination点的最短路径而不是让其他路径成为新的图的最短路径。详细实现，请见代码。