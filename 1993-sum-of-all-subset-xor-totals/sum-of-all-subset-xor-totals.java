class Solution {
    int sum=0;    
    List<List<Integer>> al = new ArrayList<>();
    void bt( int ind, int[] nums , ArrayList<Integer> li){
        int xor = 0;
        for (int j = 0; j < li.size(); j++) {
            xor ^= li.get(j);
        }
            sum= sum+xor;
       
        for ( int i=ind; i<nums.length; i++){
            li.add(nums[i]);
            bt(i+1 , nums  , li);
            li.remove(li.size()-1);
        }
    }
    public int subsetXORSum(int[] nums) {
      
        //add
        //bzcktarck
        // remove
        ArrayList li = new ArrayList<>();
        bt( 0 , nums , li);
        return sum;
        
    }
}