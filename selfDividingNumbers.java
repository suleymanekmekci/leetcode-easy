/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 *
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
class selfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivided(i)) {
                output.add(i);
            }
        }
        return output;

    }
    public static boolean isSelfDivided(int num){
        int mainNumber = num;
        while (num > 0) {
            int mod = num % 10;

            // if number contains 0 in any digit it will return false
            if (num % 10 == 0) {
                return false;
            }

            if ( !(mainNumber % mod == 0) ) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
