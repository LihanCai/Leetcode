class Solution {
    public  List<List<Integer>> ans;
    public  List<Integer> temp = new ArrayList<Integer>();
    boolean[] used;
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        find(candidates, target, 0);
        return ans;
    }
    public void find(int[] nums, int target, int index){
        if(target == 0){
            ans.add(new ArrayList(temp));
            return;
        } 
        else{
            for(int i = index; i < nums.length; i++){
                if(target - nums[i] < 0) break;
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                temp.add(nums[i]);
                target -= nums[i];
                find(nums, target, i+1);
                used[i] = false;
                target += nums[i];
                temp.removeLast();
            }
        }
    }
}