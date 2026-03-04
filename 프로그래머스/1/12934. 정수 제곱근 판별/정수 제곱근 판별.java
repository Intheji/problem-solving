class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        if (x * x == n) {
            long y = x + 1;
            return y * y;
        }
        return -1;
    }
}