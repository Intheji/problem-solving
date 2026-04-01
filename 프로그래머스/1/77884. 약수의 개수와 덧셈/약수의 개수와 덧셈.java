class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);

            // 완전제곱수이면 약수 개수가 홀수
            if (sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }
}