class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return reverse(0, x, x);
    }
    
    private boolean reverse(int rev, int n, int dummy) {
        if (n == 0) {
            return rev == dummy;
        }
        return reverse(rev * 10 + n % 10, n / 10, dummy);
    }
}