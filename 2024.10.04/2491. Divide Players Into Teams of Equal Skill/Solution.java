class Solution {
    public long dividePlayers(int[] skill) {
        long total = 0;

        for (int s : skill) {
            total += s;
        }

        int teams = skill.length / 2;

        // If total sum of skills is not divisible by the number of teams
        if (total % teams != 0)
            return -1;

        int req = (int) (total / teams);
        Arrays.sort(skill);

        int i = 0, j = skill.length - 1;
        long res = 0;

        while (i < j) {
            if (skill[i] + skill[j] != req)
                return -1;
            res += (long) skill[i] * skill[j];
            i++;
            j--;
        }

        return res;
    }
}