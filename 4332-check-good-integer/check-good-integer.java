class Solution {
    public boolean checkGoodInteger(int n) {
        int disum = 0;
        int  square = 0;
         while(n!=0){
            int rem = n % 10;
            disum = disum + rem;
            square = square + rem*rem;
            n = n / 10;

         }
        if(square - disum >= 50){
            return true;
        }
        return false;
    }

}