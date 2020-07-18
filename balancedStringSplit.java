/**Balanced strings are those who have equal quantity of 'L' and 'R' characters.

 Given a balanced string s split it in the maximum amount of balanced strings.

 Return the maximum amount of splitted balanced strings.



 Example 1:

 Input: s = "RLRRLLRLRL"
 Output: 4
 Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
class balancedStringSplit {
    public int balancedStringSplit(String s) {
        int leftCounter = 0; int rightCounter = 0; int total = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                leftCounter++;
            }
            else if (c == 'R') {
                rightCounter++;
            }

            if (leftCounter == rightCounter) {
                total++;
            }
        }
        return total;
    }
}
