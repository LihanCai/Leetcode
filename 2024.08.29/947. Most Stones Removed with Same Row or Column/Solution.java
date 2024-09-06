class Solution {
    Map<Integer, Integer> f = new HashMap<>();
    int islands = 0;

    public int removeStones(int[][] stones) {
        for (int i = 0; i < stones.length; ++i)
            union(stones[i][0], ~stones[i][1]);
        return stones.length - islands;
    }

    public int find(int x) {
        if (f.putIfAbsent(x, x) == null)
            islands++;
        if (x != f.get(x))
            f.put(x, find(f.get(x)));
        return f.get(x);
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            f.put(x, y);
            islands--;
        }
    }
}

// dfs代码：

class Solution {
    Map<Integer, Integer> f = new HashMap<>();
    int islands = 0;
    Set<int[]> visited = new HashSet();

    public int removeStones(int[][] stones) {
        int count = 0;
        for (int[] stone : stones) {
            if (!visited.contains(stone)) {
                dfs(stone, visited, stones);
                count++;
            }
        }
        return stones.length - count;
    }

    public void dfs(int[] stone, Set<int[]> visited, int[][] stones) {
        visited.add(stone);
        for (int[] other : stones) {
            if (!visited.contains(other)) {
                if (stone[0] == other[0] || stone[1] == other[1]) {
                    dfs(other, visited, stones);
                }
            }
        }
    }
}