class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i =n-1; i>=0; i--){
            if(digits[i] < 9) {
                digits[i]++;  // only digit me 1 add kerke 
            return digits; // return ker dega 
            }
            digits[i] = 0;
        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }
}
    