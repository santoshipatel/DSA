class Solution {
    public int maxDifference(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
         int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE; 
        for (int freq : counts) {
            if (freq == 0) continue; 
            if (freq % 2 != 0) {
         maxOdd = Math.max(maxOdd, freq);
            } else {
            minEven = Math.min(minEven, freq);
            }
        }
        return maxOdd - minEven;
    }
}