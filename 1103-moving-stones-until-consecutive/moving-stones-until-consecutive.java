class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        a = arr[0];
        b = arr[1];
        c = arr[2];

        int minMoves;

        if (c - a == 2) {
            minMoves = 0;
        } else if (b - a <= 2 || c - b <= 2) {
            minMoves = 1;
        } else {
            minMoves = 2;
        }

        int maxMoves = (b - a - 1) + (c - b - 1);

        return new int[]{minMoves, maxMoves};
    }
}