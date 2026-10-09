class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int point = 0;
        for (int i = 0; i <n; i++) {
            ans[point] = nums[i];
            point++;
            ans[point] = nums[i+n];
            point++;
        }
        return ans;
    }
}