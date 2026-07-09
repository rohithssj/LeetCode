class Solution {
    public boolean isPalindrome(int x) {
        String org = String.valueOf(x);
        String dup = new StringBuilder(org).reverse().toString();
        if(org.equals(dup)){
            return true;
        }
        else{
            return false;
        }
    }
}