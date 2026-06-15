class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();

        // 1. 알파벳 상하 이동 비용
        for (int i = 0; i < n; i++) {
            char c = name.charAt(i);
            int up = c - 'A';
            int down = 'Z' - c + 1;
            answer += Math.min(up, down);
        }

        // 2. 좌우 커서 이동 비용
        int move = n - 1; // 기본: 오른쪽으로 쭉 이동

        for (int i = 0; i < n; i++) {
            int next = i + 1;

            // i 다음부터 연속된 A 구간 찾기
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }

            // 오른쪽으로 갔다가 다시 왼쪽으로 돌아가는 경우
            int goRightThenLeft = i * 2 + (n - next);

            // 왼쪽으로 먼저 갔다가 오른쪽으로 돌아오는 경우
            int goLeftThenRight = (n - next) * 2 + i;

            move = Math.min(move, Math.min(goRightThenLeft, goLeftThenRight));
        }

        return answer + move;
    }
}