class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        while(low<=high){
            long mid = (low + high)/2;
            long ans = mid * mid;
            if(mid * mid == (long)num) return true;
            else if(mid * mid < (long)num) low = mid + 1;
            else high = mid - 1;

        }
        return false;
        
    }
}