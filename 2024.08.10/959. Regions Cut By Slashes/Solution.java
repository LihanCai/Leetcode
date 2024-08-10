class DisjointSet {
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    int count;

    public DisjointSet(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            size.add(1);
        }
        count=1;
    }

    public int find_parent(int node) {
        if (node == parent.get(node)) return node;
        int root = find_parent(parent.get(node));
        parent.set(node, root); 
        return root;
    }

    public void unionBySize(int u, int v) {
        int rootU = find_parent(u);
        int rootV = find_parent(v);

        if (rootU == rootV) {
            // Increment count if both nodes are already in the same set
            count++;
size.set(rootV, size.get(rootV) + size.get(rootU));
        } else {
            parent.set(rootV, rootU);
            size.set(rootU, size.get(rootU) + size.get(rootV));
        }
    }
}

class Solution {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int N = n + 1;
        DisjointSet ds = new DisjointSet(N * N);

        
       for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0||i==n||j==n){
                    int col = (n+1)*i+j;
                    if(col!=0)
                    ds.unionBySize(0,col);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i].charAt(j)=='/'){
                    int p1 = (i+1)*(n+1) + j;
                    int p2 = i*(n+1) + j+1; 
                    ds.unionBySize(p1,p2);
                    
                }
                else if(grid[i].charAt(j)=='\\'){
                     int p1 = i*(n+1) + j;
                    int p2 = (i+1)*(n+1) + j+1;
                    ds.unionBySize(p1,p2);
                }
            }
        }

        return ds.count;
    }
}
