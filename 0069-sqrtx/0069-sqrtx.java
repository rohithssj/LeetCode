class Solution {
    public int mySqrt(int x) {
        double pow = Math.floor(Math.pow(x,0.5));
        int ans = (int) pow;
        return ans;
    }
}