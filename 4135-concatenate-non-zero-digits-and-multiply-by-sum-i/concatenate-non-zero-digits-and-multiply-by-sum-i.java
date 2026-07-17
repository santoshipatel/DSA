class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) {
            return 0;
        }

        long[] result = processDigits(n);
        long x = result[0];
        long sum = result[1];

        return x * sum;
    }
    private long[] processDigits(int n) {
        long x = 0;
        long sum = 0;
        long placeValue = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                sum += digit;
                // Construct x from right to left
                x = digit * placeValue + x;
                placeValue *= 10;
            }
            n /= 10;
        }

        return new long[]{x, sum};
    }
}