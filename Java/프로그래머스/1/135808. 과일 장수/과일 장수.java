import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        // int[]는 Collections.reverseOrder()를 바로 못 쓰니까
        // Integer[]로 바꿔서 내림차순 정렬한다.
        Integer[] arr = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            arr[i] = score[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int answer = 0;

        // m개씩 묶을 수 있는 구간만 확인
        for (int i = m - 1; i < arr.length; i += m) {
            // 각 상자의 마지막 값이 최솟값
            answer += arr[i] * m;
        }

        return answer;
    }
}