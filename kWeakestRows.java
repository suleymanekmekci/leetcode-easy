/** 1337. The K Weakest Rows in a Matrix
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * 
 * Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.
 *
 * A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j, or they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row, that is, always ones may appear first and then zeros.
 *
 *
 *
 * Example 1:
 *
 * Input: mat =
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]],
 * k = 3
 * Output: [2,0,3]
 * Explanation:
 * The number of soldiers for each row is:
 * row 0 -> 2
 * row 1 -> 4
 * row 2 -> 1
 * row 3 -> 2
 * row 4 -> 5
 * Rows ordered from the weakest to the strongest are [2,0,3,1,4]
 * Example 2:
 *
 * Input: mat =
 * [[1,0,0,0],
 *  [1,1,1,1],
 *  [1,0,0,0],
 *  [1,0,0,0]],
 * k = 2
 * Output: [0,2]
 * Explanation:
 * The number of soldiers for each row is:
 * row 0 -> 1
 * row 1 -> 4
 * row 2 -> 1
 * row 3 -> 1
 * Rows ordered from the weakest to the strongest are [0,2,3,1]
 *
 *
 * Constraints:
 *
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] is either 0 or 1.
 */
class kWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        // only ones and zeros
        // 1 : Soldiers, 0 : Civilians

        // return an array : indices of the rows from weakest to the strongest

        // 2 rows with same value of soldiers it doesn't matter.

        // count the soldiers (1) for each row.
        // add them to a map with index and number of the soldiers
        // iterate all over map, find the minimum value and add its key to output

        // Time : O(m*n + m*k)
        // Space : O(m)

        // one possible optimization could be this:
        // for each row, count 1's , subtract number of the ones from length of the row

        Map<Integer,Integer> indicesAndSoldiers = new HashMap<>();

        for (int i = 0 ; i < mat.length ; i++) {
            int oneCounter = 0;

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == 1) {
                    oneCounter++;
                }
                else {
                    break;
                }


            }
            indicesAndSoldiers.put(i,oneCounter);

        }

        int[] output = new int[k];

        for (int i = 0; i < k;i++) {
            int weakest = Integer.MAX_VALUE;
            int index = -1;
            //find the lowest value
            // add its index to the output
            // delete it from the map

            for (Map.Entry<Integer,Integer> entrySet : indicesAndSoldiers.entrySet()) {
                if (entrySet.getValue() < weakest) {
                    weakest = entrySet.getValue();
                    index = entrySet.getKey();
                }
            }


            output[i] = index;
            indicesAndSoldiers.remove(index);
        }

        return output;



    }
}
