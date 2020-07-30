/** 136. Single Number
 *  https://leetcode.com/problems/single-number/
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * I couldn't do it because I don't know abut XOR's yet xd;
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
class singleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> numberSet = new HashSet<>();

        for (int num : nums) {
            if (numberSet.contains(num)){
                numberSet.remove(num);
            }
            else {
                numberSet.add(num);
            }
        }
        for (int result : numberSet){
            return result;
        }
        return 0;

    }
}
