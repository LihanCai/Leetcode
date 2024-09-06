class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public LinkedList<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        if (candidates[0] > target)
            return result;
        backtracking(candidates, target, 0, 0);
        return result;
    }

    public void backtracking(int[] candidates, int target, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] > target)
                break;
            path.add(candidates[i]);
            sum += candidates[i];
            backtracking(candidates, target, sum, i);
            path.removeLast();
            sum -= candidates[i];
        }
    }
}