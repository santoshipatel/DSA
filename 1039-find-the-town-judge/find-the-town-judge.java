class Solution {
    public int findJudge(int n, int[][] trust) {
     int[]inDeg = new int[n+1];
     int[]outDeg = new int[n+1];
     for(int[] arr: trust){
        outDeg[arr[0]]++;
        inDeg[arr[1]]++;
     }
     for(int i = 1; i<n+1; i++){
        if(inDeg[i] == n-1 && outDeg[i]==0){
            return i;
        }
     }
     return -1;
        
    }
}