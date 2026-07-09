class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        if(x<0) return false;
        while(org>0){
            int digit = org%10;
            rev = (rev*10)+digit;
            org = org/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
    }
    }
}
