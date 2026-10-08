class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(j==nums[i]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
                j=nums[i];
            }
        }
        return count;
    }
}