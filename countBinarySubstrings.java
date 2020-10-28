
/** 696. Count Binary Substrings
 * https://leetcode.com/problems/count-binary-substrings/
 * 
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * Example 1:
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
 *
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 *
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 * Example 2:
 * Input: "10101"
 * Output: 4
 * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 * Note:
 *
 * s.length will be between 1 and 50,000.
 * s will only consist of "0" or "1" characters.
 */
class countBinarySubstrings {
    public int countBinarySubstrings(String s) {

        int output = 0;
        List<Integer> groups = new ArrayList<>();
        int lengthOfCurrentGroup = 1;
        for (int i = 1; i < s.length()  ; i++) {

            char left = s.charAt(i);
            char right = s.charAt(i-1);

            if (left == right) {
                lengthOfCurrentGroup++;
                if (i == s.length()-1) {
                    groups.add(lengthOfCurrentGroup);
                }
            }
            else {
                groups.add(lengthOfCurrentGroup);
                lengthOfCurrentGroup = 1;

                if (i == s.length()-1) {
                    groups.add(lengthOfCurrentGroup);
                }
            }


        }
        // 000111000

        for (int i = 0; i < groups.size() - 1; i++) {
            output += Math.min(groups.get(i),groups.get(i+1));
        }


        return output;
    }
}
