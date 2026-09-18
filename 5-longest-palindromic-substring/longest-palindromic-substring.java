class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        // odd 
        for(int i = 0; i<n; i++){
            int low = i;
            int high = i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            String curr = s.substring(low+1,high);
            if(curr.length()>res.length()){
                res = curr;
        }
        // even
          low = i;
             high = i+1;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
             curr = s.substring(low+1,high);
            if(curr.length()>res.length()){
                res = curr;
            }
        }
        return res;
        
        }
    }
