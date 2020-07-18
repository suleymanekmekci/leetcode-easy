**
 * 
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 *
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation: 
 * 12 contains 2 digits (even number of digits). 
 * 345 contains 3 digits (odd number of digits). 
 * 2 contains 1 digit (odd number of digits). 
 * 6 contains 1 digit (odd number of digits). 
 * 7896 contains 4 digits (even number of digits). 
 * Therefore only 12 and 7896 contain an even number of digits.
 */
class findNumbers {
    public int findNumbers(int[] nums) {
        int total = 0;


        for (int num : nums){
            if ((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000) {
                total++;
            }
        }
        return total;

    }
}
