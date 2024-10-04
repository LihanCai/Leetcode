class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : arr) {
            hashmap.put(((num % k) + k) % k, hashmap.getOrDefault(((num % k) + k) % k, 0) + 1);
        }
        for (Integer key : hashmap.keySet()) {
            if (key == 0) {
                if (hashmap.get(0) % 2 == 1)
                    return false;
            } else if (hashmap.get(key) != hashmap.get(k - key))
                return false;
        }
        return true;
    }

}