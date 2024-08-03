class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], map.getOrDefault(target[i], 0) + 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) != 0)
                return false;
        }
        return true;
    }
}