class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int exchanged = n / a;      // 몇 번 교환 가능한지
            int received = exchanged * b; // 이번에 받는 콜라 수

            answer += received;
            n = (n % a) + received;     // 남은 빈 병 + 마신 뒤 생긴 빈 병
        }

        return answer;
    }
}