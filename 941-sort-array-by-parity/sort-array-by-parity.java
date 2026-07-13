class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length; // 1. 'n' ko define kiya
        int[] arr = nums;    // 2. 'arr' ko nums se reference kiya taaki aapka logic distrub na ho
        
        int[] copy = new int[n];
        int a = 0;
        int b = n - 1;
        
        // Aapke loop ke jaise hi hum pooray array ko traverse karenge
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                copy[a++] = arr[i]; // Even numbers ko shuruat se daalenge
            } else {
                copy[b--] = arr[i];  // Odd numbers ko peeche se daalenge
            }
        }
        
        // Copy array se wapas main arr mein data transfer kiya aapke logic ki tarah
        for (int i = 0; i < n; i++) {
            arr[i] = copy[i];
        }
        
        return arr;
    }
}