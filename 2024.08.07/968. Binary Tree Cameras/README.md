# Leetcode 968

本题描述很清晰，监控能够监视子节点，本身和它的父节点。如果从根节点考虑问题，则其能监视父节点的作用就没用了。从叶子节点考虑，则只能监视其本身和其父节点。但其父节点能够监视该叶子节点，本身和其父节点，三个范围都有作用，利用贪心的思想，将监控范围最大化。由此，每个节点都有三个状态，未被覆盖，被覆盖，和当前位置有摄像头，用dfs算法遍历，若当前位置的左节点或者右节点有摄像头，则当前节点设置为被覆盖。若当前位置的节点的子节点是叶子节点，则放置摄像头。