class Solution {
    public int maxDistinct(String s) {
        Set<Character>set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(char ele: ch){
            set.add(ele);

        }
        return set.size();  
    }
}