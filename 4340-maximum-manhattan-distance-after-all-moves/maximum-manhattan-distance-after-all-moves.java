class Solution {
    public int maxDistance(String moves) {
       int u=0;
        int d=0;
        int l=0;
        int r=0;
        int b=0;
        for ( int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='D') d++;
          else  if(moves.charAt(i)=='U') u++;
         else   if(moves.charAt(i)=='R') r++;
          else   if(moves.charAt(i)=='L') l++;
                   else b++;
        }
                   int ans =Math.abs(r-l)+Math.abs(u-d)+b;
                   return ans;
    }
}