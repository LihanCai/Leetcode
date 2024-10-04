class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";

        // Convert int array to String array, so we can sort later on
        String[] s_num = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            s_num[i] = String.valueOf(nums[i]);

        Arrays.sort(s_num, (a, b) -> (b + a).compareTo(a + b));

        // An extreme edge case by lc, say you have only a bunch of 0 in your int array
        if (s_num[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : s_num)
            sb.append(s);

        return sb.toString();

    }
}