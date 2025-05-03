public class dominoRotation {
    //1007. Minimum Domino Rotations For Equal Rows

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int res = Integer.MAX_VALUE;
        for (int val = 1; val <= 6; val++) {
            int topSwaps = 0, bottomSwaps = 0;
            boolean valid = true;
            for (int i = 0; i < tops.length; i++) {
                if (tops[i] != val && bottoms[i] != val) {
                    valid = false;
                    break;
                }
                if(tops[i] != val) {
                    topSwaps++;
                }
                if(bottoms[i] != val) {
                    bottomSwaps++;
                }
            }
            if (valid) {
                res = Math.min(res, Math.min(topSwaps, bottomSwaps));
            }

        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        int[] A = { 2, 1, 2, 4, 2, 2 };
        int[] B = { 5, 2, 6, 2, 3, 2 };
        int result = minDominoRotations(A, B);
        System.out.println(result); // Output: 2
    }
}
