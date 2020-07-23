/**
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 * Example 2:
 *
 * Input: n = 3
 * Output: [-1,0,1]
 * Example 3:
 *
 * Input: n = 1
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 1000
 */
class sumZero {
    public int[] sumZero(int n) {
        int[] output = new int[n];

        int toAdd = 1;

        for (int i = 0; i < n; i++) {
            output[i] = toAdd;

            if (toAdd < 0 ) {
                toAdd *= (-1);
                toAdd++;
            }
            else {
                toAdd *= (-1);
            }
        }

        // started with positive, if n is odd, (the last element will be positive in this case) there should be 0 in output
        if (output[n - 1] > 0) {
            output[n - 1] = 0;
        }

        return output;
    }
}
