/** 387. First Unique Character in a String
 *  https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode"
 * return 2.
 *
 *
 * Note: You may assume the string contains only lowercase English letters.
 */
class firstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charIndexMap = new HashMap<>();
        char[] letters = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (charIndexMap.containsKey(letters[i])) {
                charIndexMap.put(letters[i],-1);
            }
            else {
                charIndexMap.put(letters[i],i);
            }
        }

        int min = Integer.MAX_VALUE;

        for (Map.Entry<Character,Integer> entry : charIndexMap.entrySet()) {
            if (entry.getValue() == -1) {
                continue;
            }
            else {
                if (min > entry.getValue()) {
                    min = entry.getValue();
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}
