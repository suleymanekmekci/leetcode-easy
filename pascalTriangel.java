/** 118. Pascal's Triangle
 *  https://leetcode.com/problems/pascals-triangle/
 *  
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
class generate {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new ArrayList<>();
        for (int i = 1; i <= numRows ; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            if (i == 1) {
                output.add(temp);
                continue;
            }
            if (i == 2) {
                temp.add(1);
                output.add(temp);
                continue;
            }
            int index = 0;
            while (index < i - 2) {
                temp.add( output.get(i-2).get(index) + output.get(i-2).get(index+1) );
                index++;

            }
            temp.add(1);
            output.add(temp);



        }
        return output;
    }
}
