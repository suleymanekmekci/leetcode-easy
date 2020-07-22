/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
class isAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<String, Integer> letterMap = new  HashMap<>();

        for (String letter : s.split("")) {
            if (!(letterMap.containsKey(    letter))) {
                letterMap.put(letter,1);
            }
            else {
                letterMap.put(letter,letterMap.get(letter) + 1);
            }
        }

        for (String letter : t.split("")) {
            if ( !(letterMap.containsKey(letter))) {
                return false;
            }
            else {
                letterMap.put(letter,letterMap.get(letter) - 1);
            }
        }

        for(Integer num : letterMap.values()) {

            if (num > 0 || num < 0) {
                return false;
            }
        }
        return true;
    }
}
