class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[2*n];
        int point = 0;
        for(int i= 0;i<n;i++){
            arr[point] = nums[i];
            point++;
            arr[point] = nums[i+n];
            point++;
        }
        return arr;
    }
}