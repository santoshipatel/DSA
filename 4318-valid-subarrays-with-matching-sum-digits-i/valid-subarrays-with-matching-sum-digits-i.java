class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int cnt=0;
        char b =(char) (x + '0');
        for(int i=0; i<nums.length; i++){
            long sum=0;
              for(int j=i; j<nums.length; j++){
                  sum = sum+nums[j];
                  String a=Long.toString(sum);
                  if( a.charAt(0)== b && a.charAt(a.length()-1) == b ) cnt++;
        }
        }
        return cnt;
    }
}
    
        