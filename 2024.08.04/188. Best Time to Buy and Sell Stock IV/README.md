# Leetcode 188

有了题目123的基础，我刚开始把题目从k逐个带入，比如k=3，4，...，时，意识到实际上代码的执行顺序只需要不断重复找sell和buy即可。当k为3时，重复三次，以此类推，将sell和buy初始化为大小为k+1即可完成该题目，整体思想和123完全一致。初始化要注意哦！