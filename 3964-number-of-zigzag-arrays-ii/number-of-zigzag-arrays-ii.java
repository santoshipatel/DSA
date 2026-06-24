class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        if (n == 1) return m;

        int len = 2 * m;
        long[][] T = new long[len][len];
        
        // Build the transition matrix T according to Hint 3
        for (int x = 0; x < m; x++) {
            // From State (x, up) [next compare = down]: transition to (y, down) for all y < x
            for (int y = 0; y < x; y++) {
                T[y + m][x] = 1;
            }
            // From State (x, down) [next compare = up]: transition to (y, up) for all y > x
            for (int y = x + 1; y < m; y++) {
                T[y][x + m] = 1;
            }
        }

        // Fast matrix exponentiation to compute T^(n-1)
        long[][] res = new long[len][len];
        for (int i = 0; i < len; i++) res[i][i] = 1; // Identity matrix
        
        long[][] base = T;
        int exp = n - 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = multiply(res, base);
            }
            base = multiply(base, base);
            exp >>= 1;
        }

        // Compute the final result using the initial vector (all 1s)
        long totalWays = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                totalWays = (totalWays + res[i][j]) % MOD;
            }
        }

        return (int) totalWays;
    }

    private long[][] multiply(long[][] A, long[][] B) {
        int len = A.length;
        long[][] C = new long[len][len];
        for (int i = 0; i < len; i++) {
            for (int k = 0; k < len; k++) {
                if (A[i][k] == 0) continue; // Optimization for sparse matrix
                for (int j = 0; j < len; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }
}