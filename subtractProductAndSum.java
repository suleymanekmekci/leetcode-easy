
/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 *
 *
 * Example 1:
 *
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 */
class subtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        /*

        for (String s : Integer.toString(n).split("") ) {

            sum += Integer.parseInt(s);
            product *= Integer.parseInt(s);
        }
        */
        while (n > 0) {
            int digit = n%10;
            sum += digit;
            product *= digit;
            n/=10;
        }
        return product - sum;
    }
}
