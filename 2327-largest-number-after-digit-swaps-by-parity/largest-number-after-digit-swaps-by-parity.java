class Solution {
    public int largestInteger(int num) {
        // Number ko char array mein convert kar lete hain taaki positions aur swaps handle karna easy ho
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;
        
        // Simple nested loop se check karenge (jaise standard sorting mein karte hain)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Pehle check karo dono ki parity (even/odd status) same hai ya nahi
                if ((digits[i] - '0') % 2 == (digits[j] - '0') % 2) {
                    // Agar same hai aur aage wala digit bada hai, toh swap kar do
                    if (digits[j] > digits[i]) {
                        char temp = digits[i];
                        digits[i] = digits[j];
                        digits[j] = temp;
                    }
                }
            }
        }
        return Integer.parseInt(new String(digits));
    }
}