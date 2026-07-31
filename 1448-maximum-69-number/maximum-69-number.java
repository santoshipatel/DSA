class Solution {
    public int maximum69Number (int num) {
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        int rev1 = 0;
        int sixCount = 0;
        while(rev > 0){
            int rem = rev % 10;
            if(rem == 6 && sixCount < 1){
                sixCount++;
                rem = 9;
            }
            rev1 = rev1*10 + rem;
            rev = rev/10;
        }
        return rev1;
    }
}