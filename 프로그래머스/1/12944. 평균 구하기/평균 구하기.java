class Solution {
    public double solution(int[] arr) {
        long sum = 0;             
        for (int x : arr) {
            sum += x;
        }
        return (double) sum / arr.length;
    }
}