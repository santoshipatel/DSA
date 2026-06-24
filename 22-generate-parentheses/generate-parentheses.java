class Solution {
    public void helper(int n,String curr,int lc,int rc,List<String>ans){
        // base case
        if(curr.length() == 2*n){
            ans.add(curr);
            return;
        }
        // pickleft
        if(lc < n){
            helper(n , curr+"(",lc+1,rc,ans);
        }
        // pick right
        if(rc < lc){
       
        helper(n , curr+")",lc,rc+1,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        helper(n,"",0,0,ans);
        return ans;
        
    }
}