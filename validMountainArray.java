/* 941. Valid Mountain Array
https://leetcode.com/problems/valid-mountain-array/

Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]


 

Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true
 

Note:

0 <= A.length <= 10000
0 <= A[i] <= 10000 
*/
class validMountainArray {
    public boolean validMountainArray(int[] A) {
        
        // for each pair (two adjacent values) 
        
        // find peak of the array
        // iterate from index zero to middle check if the pairs first number
        // is less than the second number
        
        // once reach the middle check if the first number of the pair is greater than the second number
        
        // [1,3,1] length = 3 / 2,  1 middle index is correct
        
        // first iterate array find the maximum
        
        if (A.length == 1 || A.length == 2 || A.length == 0) {
            return false;
        }
        
        int peakIndex = -1;
        int peakValue = -1;
        
        for (int i =0; i < A.length; i++) {
            if (A[i] > peakValue) {
                peakIndex = i;
                peakValue = A[i];
            }
        }
        if (peakIndex == 0 || peakIndex == A.length-1) {
            return false;
        }
        
        for (int i = 0; i < A.length - 1; i++) {
            if (i >= peakIndex) {
                if (A[i] <= A[i+1]) {
                    return false;
                }
                
            }
            else {
                if (A[i] >= A[i+1]) {
                    return false;
                }
            }
            
            
        }
        
        return true;
        
    }
}
