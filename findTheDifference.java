/** 389. Find the Difference
 * https://leetcode.com/problems/find-the-difference/
 *
 * You are given two strings s and t.
 *
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 *
 * Return the letter that was added to t.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", t = "abcde"
 * Output: "e"
 * Explanation: 'e' is the letter that was added.
 * Example 2:
 *
 * Input: s = "", t = "y"
 * Output: "y"
 * Example 3:
 *
 * Input: s = "a", t = "aa"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ae", t = "aea"
 * Output: "a"
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s and t consist of lower-case English letters.
 */
class findTheDifference {
    public char findTheDifference(String s, String t) {

        // s and t
        // length of s => n , length of t => n+1
        // there will be only 1 difference between these strings

        // only strings, //aa
        // s : aa
        // t : aab   > b

        // direct solution
        // i will count the frequency of the strings in the s
        // by using hashmap ()


        // check all the strings of the t inside of the map.
        // if map contains current character,  decrease frequency of this letter
        // 1 - > if map doesn't contain current character

        // O(n) time n is being the length of the s
        // O(1) space complexity

        Map<Character,Integer> letterFreq = new HashMap<>();

        for (char letter : s.toCharArray()) {
            if (letterFreq.containsKey(letter)) {
                letterFreq.put(letter,letterFreq.get(letter) + 1);
            }
            else {
                letterFreq.put(letter,1);
            }

        }

        for (char letter : t.toCharArray()) {
            if (letterFreq.containsKey(letter)) {
                letterFreq.put(letter,letterFreq.get(letter) - 1);

                // if value is 0 remove it from the map
                if (letterFreq.get(letter) == 0) {
                    letterFreq.remove(letter);
                }
            }
            else {
                return letter;
            }
        }



        return ' ';

    }
}
