class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> fl = new ArrayList<>();
        Arrays.sort(nums);
       backtrack(fl, new ArrayList<>(), nums, 0);
         
       return fl;
    }

    public void backtrack(List<List<Integer>> fl ,List<Integer> currList , int[]nums , int start){

             if(!fl.contains(new ArrayList<>(currList))){
            fl.add(new ArrayList<>(currList));
        }

        for(int i = start; i<nums.length; i++){
            currList.add(nums[i]);
           backtrack(fl, new ArrayList<>(currList), nums, i+1);
           currList.remove(currList.size()-1);
        } 
           
    
    }
}