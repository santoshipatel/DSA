class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int unPlaced = 0;
        for(int i=0; i<n; i++){
            boolean place = false;
            for(int j=0; j<n; j++){
                if(baskets[j] != -1 && baskets[j] >= fruits[i]){
                    baskets[j] = -1;   //mark this basket as used
                    place = true;
                    break;    //move to next fruit
                }
            }
            if(!place) unPlaced++;   //agr inner loop khtm hone ke baad place --> false hi reh gya mtlb us fruit ko basket nhi mila
        }
        return unPlaced;
    }
}