/** 1572. Matrix Diagonal Sum
 *  https://leetcode.com/problems/matrix-diagonal-sum/
 *  
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 * Example 2:
 *
 * Input: mat = [[1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1]]
 * Output: 8
 * Example 3:
 *
 * Input: mat = [[5]]
 * Output: 5
 *
 *
 * Constraints:
 *
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 */
class diagonalSum {
    public int diagonalSum(int[][] mat) {
        // i will create two pointers to start end to end.
        // look all the rows and for each row, i will increment start pointer, decrease end pointer
        // take the sum of the values which are pointed by pointers


        // TODO: CHECK IF THE POINTERS ARE EQUAL (Take one value only)
        // 1x1 -> check if there is an error

        // Time : O(n) n is being length of the mat
        // Space : O(1)

        int total = 0; // 4 + 5 + 16
        int startPointer = 0; // 0->1 | 1->5 | 2->9
        int endPointer = mat[0].length - 1; // 2->3 |  1->5 | 0->7

        for (int[] row: mat) {

            if (startPointer == endPointer) {
                total += row[startPointer];
                startPointer++;
                endPointer--;
                continue;
            }


            total += row[startPointer];
            total += row[endPointer];

            startPointer++;
            endPointer--;

        }

        return total;
    }
}
