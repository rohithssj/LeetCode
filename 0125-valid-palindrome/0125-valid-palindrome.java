class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed = new StringBuilder(result).reverse().toString();
        if(reversed.equals(result)){
            return true;
        }
        return false;

    }
}