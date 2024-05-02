class Solution {
    int[][] graph;
    int length;
    List<Integer> current;
    List<List<Integer>> path;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        length = graph.length;
        current = new ArrayList(length);
        path = new ArrayList();
        current.add(0);
        dfs(0);
        return path;
    }

    private void dfs(int source) {
        if (source == length-1) {
            path.add(new ArrayList(current));
            return;
        }
        for (int i : graph[source]) {
            current.add(i);
            dfs(i);
            current.remove(current.size()-1);
        }
    }
}