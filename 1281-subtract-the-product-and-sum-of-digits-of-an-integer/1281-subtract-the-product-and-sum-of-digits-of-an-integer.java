class Solution {
    public int subtractProductAndSum(int n) {
        String newNum = String.valueOf(n);
        int product = 1;
        int sum = 0;
        for(int i = 0;i<newNum.length();i++){
            int number = Character.getNumericValue(newNum.charAt(i));
            product*=number;
            sum+=number;
        }
        int total = product-sum;
        return total;
    }
}