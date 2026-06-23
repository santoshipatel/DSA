class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> hm = new HashMap<>();
        for ( int i =0; i<text.length(); i++){
            hm.put( text.charAt(i) , hm.getOrDefault( text.charAt(i) , 0)+1);
        }
        int min=Integer.MAX_VALUE;
        int b  = hm.getOrDefault('b', 0);
        int a =hm.getOrDefault('a', 0);
        int l=hm.getOrDefault('l', 0)/2;
       int o=hm.getOrDefault('o', 0)/2;
      int n=hm.getOrDefault('n', 0);
      min= Math.min( a, Math.min( b , Math.min( l,Math.min(o, n))));
      return min;
    }
}