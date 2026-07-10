class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for (i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                int num = digits[i];
                num++;
                digits[i] = num;
                break;
            }
            else if(digits[i]==9){
                digits[i]=0;
            }
        }
        if(i!=-1){
            return digits;
        }
        if(i==-1){
            int n = digits.length;
            int[] ans = new int[n+1];
            ans[0] = 1;
            for(int j = 1;j<n+1;j++){
                ans[j]  = 0;
            }
            return ans;
        }
        return new int[0];

    }
}