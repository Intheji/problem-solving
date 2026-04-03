import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        int bestRank = getRank(matchCount + zeroCount);
        int worstRank = getRank(matchCount);

        return new int[]{bestRank, worstRank};
    }

    private int getRank(int matchCount) {
        if (matchCount >= 2) {
            return 7 - matchCount;
        }
        return 6;
    }
}