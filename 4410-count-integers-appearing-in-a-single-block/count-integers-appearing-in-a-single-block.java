class Solution {
    public int countSpecialIntegers(int[] nums) {
       Set<Integer> seen = new HashSet<>();
       Set<Integer> invalid = new HashSet<>();
       seen.add(nums[0]);

       for(int i=0; i<nums.length-1; i++){
          if(nums[i] != nums[i+1]){
            if(seen.contains(nums[i+1])){
                invalid.add(nums[i+1]);
            }
            else{
                seen.add(nums[i+1]);
            }
          }
       }
       return seen.size() - invalid.size();
    }
}