class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // -2 左转90
        // -1 右转90
        // 1-9 前进k格
        // 遇到障碍会停止，直到转换方向
        // 返回走路过程中的最大欧氏距离（要平方）
        int[][] direction = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int index = 0;
        int x = 0, y = 0;
        // 用hashset来检测是否碰到障碍 更方便
        Set<String> set = new HashSet<>();
        int ans = 0;
        for (int[] obs : obstacles) {
            set.add(obs[0] + " " + obs[1]);
        }
        for (int command : commands) {
            if (command == -1) {
                index = (index + 1) % 4;
            } else if (command == -2) {
                index = (index + 3) % 4;
            }

            else {
                while (command-- > 0 && !set.contains((x + direction[index][0]) + " " + (y + direction[index][1]))) {
                    x += direction[index][0];
                    y += direction[index][1];
                }
            }
            ans = Math.max(ans, x * x + y * y);
        }
        return ans;
    }
}